
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.api.awt.AWTSequenceEncoder;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.model.Picture;
import org.jcodec.scale.AWTUtil;

public class ExtractFrames {

    private static final String DES_ALGORITHM = "DES";
    private static final String SECRET_KEY = "secretKe"; // 8-byte key for DES

    public static void main(String[] args) {
        String inputFilename = "C:\\Users\\Admin\\Downloads\\sunset.mp4";
        String outputDir = "C:\\Users\\Admin\\Downloads\\frames1";
        String encryptedOutputDir = "C:\\Users\\Admin\\Downloads\\frames_encrypted";
        String decryptedOutputDir = "C:\\Users\\Admin\\Downloads\\frames_decrypted";
        String decryptedVideoOutput = "C:\\Users\\Admin\\Downloads\\decrypted_video.mp4";

        File outputDirectory = new File(outputDir);
        File encryptedDirectory = new File(encryptedOutputDir);
        File decryptedDirectory = new File(decryptedOutputDir);

        if (!outputDirectory.exists()) {
            outputDirectory.mkdirs();
        }
        if (!encryptedDirectory.exists()) {
            encryptedDirectory.mkdirs();
        }
        if (!decryptedDirectory.exists()) {
            decryptedDirectory.mkdirs();
        }

        List<BufferedImage> decryptedImages = new ArrayList<>();

        try {
            System.out.println("Starting frame extraction and processing...");

            File inputFile = Paths.get(inputFilename).toFile();
            FrameGrab grab = FrameGrab.createFrameGrab(NIOUtils.readableChannel(inputFile));
            Picture picture;
            int frameNumber = 0;

            while ((picture = grab.getNativeFrame()) != null) {
                BufferedImage bufferedImage = AWTUtil.toBufferedImage(picture);

                // Save original frame
                String outputFilename = String.format("%s/frame_%d.png", outputDir, frameNumber);
                ImageIO.write(bufferedImage, "png", new File(outputFilename));
                System.out.println("Saved original frame: " + outputFilename);

                // Encrypt frame
                String encryptedFilename = String.format("%s/frame_%d.png", encryptedOutputDir, frameNumber);
                encryptDES(bufferedImage, encryptedFilename);
                System.out.println("Encrypted frame: " + encryptedFilename);

                // Decrypt frame
                String decryptedFilename = String.format("%s/frame_%d.png", decryptedOutputDir, frameNumber);
                BufferedImage decryptedImage = decryptDES(encryptedFilename, decryptedFilename);
                decryptedImages.add(decryptedImage);
                System.out.println("Decrypted frame: " + decryptedFilename);

                frameNumber++;
            }

            // Create video from decrypted frames
            System.out.println("Creating video from decrypted frames...");
            createVideoFromFrames(decryptedImages, decryptedVideoOutput);
            System.out.println("Video creation complete: " + decryptedVideoOutput);

        } catch (IOException | JCodecException | IllegalBlockSizeException | InvalidKeyException | BadPaddingException
                | NoSuchAlgorithmException | NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }

    private static void encryptDES(BufferedImage image, String outputFile) throws IOException, InvalidKeyException,
            NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(DES_ALGORITHM);
        SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), DES_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Convert BufferedImage to byte array
        byte[] imageData = imageToByteArray(image);

        // Encrypt byte array
        byte[] encryptedData = cipher.doFinal(imageData);

        // Write encrypted data to file
        Files.write(Paths.get(outputFile), encryptedData, StandardOpenOption.CREATE);
    }

    private static BufferedImage decryptDES(String inputFile, String outputFile)
            throws IOException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException,
            IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance(DES_ALGORITHM);
        SecretKey secretKey = new SecretKeySpec(SECRET_KEY.getBytes(), DES_ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        // Read encrypted data from file
        byte[] encryptedData = Files.readAllBytes(Paths.get(inputFile));

        // Decrypt byte array
        byte[] decryptedData = cipher.doFinal(encryptedData);

        // Convert decrypted byte array to BufferedImage
        BufferedImage decryptedImage = byteArrayToImage(decryptedData);

        // Write decrypted image to file (optional)
        ImageIO.write(decryptedImage, "png", new File(outputFile));

        return decryptedImage;
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

    private static byte[] imageToByteArray(BufferedImage image) throws IOException {
        // Convert BufferedImage to byte array
        File tempFile = File.createTempFile("temp", null);
        ImageIO.write(image, "png", tempFile);
        byte[] imageData = Files.readAllBytes(tempFile.toPath());
        tempFile.delete();
        return imageData;
    }

    private static BufferedImage byteArrayToImage(byte[] bytes) throws IOException {
        // Convert byte array to BufferedImage
        File tempFile = File.createTempFile("temp", null);
        Files.write(tempFile.toPath(), bytes);
        BufferedImage image = ImageIO.read(tempFile);
        tempFile.delete();
        return image;
    }
}