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

public class VideoToFrames {

    public static void main(String[] args) throws IOException, JCodecException {
        // Input video file (MP4 format)
        String videoFilePath = "C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\video encryption\\sunset.mp4";

        // Output directory to save frames
        String outputDir = "C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\frames\\";
        
        byte[] encryptionKey = generateRandomKey(16); 
        String decryptedDir = "C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\decrypted\\";
        String encryptedDir = outputDir;
      //  byte[] key = Base64.getDecoder().decode(encryptionKey);
        String decrypted="C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\decryptedvdo";
        

        // Create File object for the video file
        File videoFile = new File(videoFilePath);

        // Open the video file with FrameGrab
        FrameGrab grab = FrameGrab.createFrameGrab(NIOUtils.readableChannel(videoFile));

        // Iterate through frames and save them as images
        int frameNumber = 0;
        Picture picture;
        while ((picture = grab.getNativeFrame()) != null) {
            // Convert Picture to BufferedImage
            BufferedImage image = AWTUtil.toBufferedImage(picture);

            // Save each frame as PNG file
            byte[] encryptedImageData = encryptImage(toBytes(image), encryptionKey);
            saveEncryptedImage(encryptedImageData, outputDir, "frame_" + frameNumber + ".png");
            frameNumber++;
        }
        List<BufferedImage> decryptedImages = new ArrayList<>();
        for (frameNumber = 0;; frameNumber++) {
            Path encryptedPath = Paths.get(encryptedDir, "frame_" + frameNumber + ".png");
            if (!Files.exists(encryptedPath)) break; // Stop if no more frames

            byte[] encryptedData = Files.readAllBytes(encryptedPath);
            byte[] decryptedData = decryptImage(encryptedData, encryptionKey);

            BufferedImage image = ImageIO.read(new ByteArrayInputStream(decryptedData));
            decryptedImages.add(image);
            Path outputPath = Paths.get(decryptedDir, "frame_" + frameNumber + ".png");
            ImageIO.write(image, "png", outputPath.toFile());
        }
        System.out.println("Number of frames"+frameNumber);
        System.out.println("Encryption key (Base64): " + java.util.Base64.getEncoder().encodeToString(encryptionKey));
        System.out.println("Video reconstructed-:");  
        createVideoFromFrames(decryptedImages, decrypted);
        System.out.println("Frames extracted and saved to: " + outputDir);
        
        System.out.println("Images decrypted and saved to: " + decryptedDir);
    }
 // Convert JCodec Picture to BufferedImage
    private static BufferedImage toBufferedImage(Picture picture) {
        int width = picture.getWidth();
        int height = picture.getHeight();
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);

        // Copy data from JCodec Picture to BufferedImage
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

    // Save encrypted image byte array as PNG file at specific path
    private static void saveEncryptedImage(byte[] encryptedData, String directoryPath, String fileName) throws IOException {
        Path outputPath = Paths.get(directoryPath, fileName);
        Files.write(outputPath, encryptedData);
    }

    // Generate a random byte array of given size
    private static byte[] generateRandomKey(int size) {
        byte[] key = new byte[size];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(key);
        return key;
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
    private static void createVideoFromFrames(List<BufferedImage> frames, String outputFilename) throws IOException {
        File out = new File(outputFilename);

        // Define video properties
        int frameRate = 30;
        int width = frames.get(0).getWidth();
        int height = frames.get(0).getHeight();

        AWTSequenceEncoder encoder = AWTSequenceEncoder.createSequenceEncoder(out, frameRate);

        for (BufferedImage frame : frames) {
            encoder.encodeImage(frame);
        }

        encoder.finish();
    }

    
}
