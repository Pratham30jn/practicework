
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.api.awt.AWTSequenceEncoder;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;

public class PSNR {

    public static void main(String[] args) throws IOException, JCodecException {
        String videoFilePath = "C:\\Users\\Admin\\Downloads\\sunset.mp4";
        String outputDir = "C:\\Users\\Admin\\Downloads\\frames1";
        byte[] encryptionKey = generateRandomKey(32); 
        String decryptedDir = "C:\\Users\\Admin\\Downloads\\frames_decrypted";
        String decryptedVideoPath = "C:\\Users\\Admin\\Downloads\\decrypted_video.mp4";
        
        File videoFile = new File(videoFilePath);
        FrameGrab grab = FrameGrab.createFrameGrab(NIOUtils.readableChannel(videoFile));

        List<Double> psnrValues = new ArrayList<>();
        int frameNumber = 0;
        Picture picture;
        while ((picture = grab.getNativeFrame()) != null) {
            BufferedImage originalImage = AWTUtil.toBufferedImage(picture);

            // Encrypt and save the frame
            byte[] encryptedImageData = encryptImage(toBytes(originalImage), encryptionKey);
            saveEncryptedImage(encryptedImageData, outputDir, "frame_" + frameNumber + ".png");

            // Decrypt and calculate PSNR
            byte[] decryptedData = decryptImage(encryptedImageData, encryptionKey);
            BufferedImage decryptedImage = ImageIO.read(new ByteArrayInputStream(decryptedData));
            double psnr = calculatePSNR(originalImage, decryptedImage);

            // Store PSNR value and print to console
            psnrValues.add(psnr);
            System.out.println("Frame " + frameNumber + " PSNR: " + psnr);

            // Save decrypted frame
            Path outputPath = Paths.get(decryptedDir, "frame_" + frameNumber + ".png");
            ImageIO.write(decryptedImage, "png", outputPath.toFile());

            frameNumber++;
        }

        // Print average PSNR
        double averagePSNR = psnrValues.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Average PSNR: " + averagePSNR);

        // Optional: Create video from decrypted frames
        List<BufferedImage> decryptedImages = loadImagesFromDirectory(decryptedDir);
        createVideoFromFrames(decryptedImages, decryptedVideoPath);

        System.out.println("Frames extracted and saved to: " + outputDir);
        System.out.println("Images decrypted and saved to: " + decryptedDir);
        System.out.println("Decrypted video saved to: " + decryptedVideoPath);
    }

    private static BufferedImage toBufferedImage(Picture picture) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
        byte[] data = picture.getPlaneData(0);
        byte[] imageData = ((java.awt.image.DataBufferByte) image.getRaster().getDataBuffer()).getData();
        System.arraycopy(data, 0, imageData, 0, data.length);
        return image;
    }

    private static byte[] toBytes(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }

    private static byte[] encryptImage(byte[] input, byte[] key) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "RC4");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            return cipher.doFinal(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void saveEncryptedImage(byte[] encryptedData, String directoryPath, String fileName) throws IOException {
        Path outputPath = Paths.get(directoryPath, fileName);
        Files.write(outputPath, encryptedData);
    }

    private static byte[] decryptImage(byte[] input, byte[] key) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "RC4");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            return cipher.doFinal(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static double calculatePSNR(BufferedImage originalImage, BufferedImage decryptedImage) {
        int width = originalImage.getWidth();
        int height = originalImage.getHeight();

        double mse = 0;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int rgbOriginal = originalImage.getRGB(x, y);
                int rgbDecrypted = decryptedImage.getRGB(x, y);
                int rDiff = ((rgbOriginal >> 16) & 0xFF) - ((rgbDecrypted >> 16) & 0xFF);
                int gDiff = ((rgbOriginal >> 8) & 0xFF) - ((rgbDecrypted >> 8) & 0xFF);
                int bDiff = (rgbOriginal & 0xFF) - (rgbDecrypted & 0xFF);
                mse += (rDiff * rDiff + gDiff * gDiff + bDiff * bDiff) / 3.0;
            }
        }

        mse /= (width * height);
        if (mse == 0) {
            return Double.POSITIVE_INFINITY;
        }

        double maxPixelValue = 255.0;
        return 10 * Math.log10((maxPixelValue * maxPixelValue) / mse);
    }

    private static List<BufferedImage> loadImagesFromDirectory(String directoryPath) throws IOException {
        List<BufferedImage> images = new ArrayList<>();
        File dir = new File(directoryPath);
        File[] files = dir.listFiles((dir1, name) -> name.endsWith(".png"));
        if (files != null) {
            for (File file : files) {
                BufferedImage image = ImageIO.read(file);
                images.add(image);
            }
        }
        return images;
    }

    private static void createVideoFromFrames(List<BufferedImage> frames, String outputFilename) throws IOException {
        File out = new File(outputFilename);
        int frameRate = 30;
        int width = frames.get(0).getWidth();
        int height = frames.get(0).getHeight();
        AWTSequenceEncoder encoder = AWTSequenceEncoder.createSequenceEncoder(out, frameRate);

        for (BufferedImage frame : frames) {
            encoder.encodeImage(frame);
        }

        encoder.finish();
    }

    private static byte[] generateRandomKey(int size) {
        byte[] key = new byte[size];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(key);
        return key;
    }
}