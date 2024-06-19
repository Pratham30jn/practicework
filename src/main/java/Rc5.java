import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jcodec.api.FrameGrab;
import org.jcodec.api.JCodecException;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.common.model.Picture;

public class Rc5 {

    public static void main(String[] args) throws IOException, JCodecException, NoSuchAlgorithmException {
        // Register Bouncy Castle as the security provider
        Security.addProvider(new BouncyCastleProvider());

        // Input video file (MP4 format)
        String videoFilePath = "C:\\Users\\dell\\video";

        // Output directory to save frames
        String outputDir = "C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\frames";

        // Generate a random encryption key for RC5
        byte[] encryptionKey = generateRandomKey(16); // 128 bits key size

        // Create File object for the video file
        File videoFile = new File(videoFilePath);

        // Open the video file with FrameGrab
        FrameGrab grab = FrameGrab.createFrameGrab(NIOUtils.readableChannel(videoFile));

        // Iterate through frames and save them as encrypted images
        int frameNumber = 0;
        Picture picture;
        while ((picture = grab.getNativeFrame()) != null) {
            // Convert Picture to BufferedImage
            BufferedImage image = toBufferedImage(picture);

            // Encrypt and save each frame as PNG file
            byte[] encryptedImageData = encryptImage(toBytes(image), encryptionKey);
            saveEncryptedImage(encryptedImageData, outputDir, "frame_" + frameNumber + ".png");

            frameNumber++;
        }

        System.out.println("Frames encrypted and saved to: " + outputDir);
        System.out.println("Encryption key (Base64): " + java.util.Base64.getEncoder().encodeToString(encryptionKey));
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

    // Convert BufferedImage to byte array
    private static byte[] toBytes(BufferedImage image) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image, "png", baos);
        return baos.toByteArray();
    }

    // Encrypt image byte array using RC5 algorithm
    private static byte[] encryptImage(byte[] input, byte[] key) {
        try {
            Cipher cipher = Cipher.getInstance("RC5/ECB/PKCS5Padding", "BC");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "RC5");
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
    private static byte[] generateRandomKey(int size) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("RC5");
        keyGenerator.init(size * 8); // size in bits
        SecretKey secretKey = keyGenerator.generateKey();
        return secretKey.getEncoded();
    }
}
