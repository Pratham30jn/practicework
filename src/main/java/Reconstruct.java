import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.jcodec.api.awt.AWTSequenceEncoder;

public class Reconstruct {

    public static void main(String[] args) throws IOException {
        // Directory where decrypted images are saved
        String decryptedDir = "C:\\Users\\dell\\OneDrive - J.C. Bose University\\Desktop\\decrypted\\";

        // Output video file path
        String outputVideoPath = "C:\\Users\\dell\\Downloads";

        // Create an AWTSequenceEncoder for the output video file
        AWTSequenceEncoder encoder = AWTSequenceEncoder.createSequenceEncoder(new File(outputVideoPath), 30);

        // Add each frame to the video
        for (int frameNumber = 0;; frameNumber++) {
            Path imagePath = Paths.get(decryptedDir, "frame_" + frameNumber + ".png");
            if (!Files.exists(imagePath)) break; // Stop if no more frames

            BufferedImage image = ImageIO.read(imagePath.toFile());
            encoder.encodeImage(image);
        }

        // Finalize the video encoding
        encoder.finish();

        System.out.println("Video reconstructed and saved to: " + outputVideoPath);
    }
}
