import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public abstract class Encoder {

    public static String encode(String file) {
        byte[] bytes = new byte[0];
        try {
            bytes = Files.readAllBytes(Paths.get(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Base64.getEncoder().encodeToString(bytes);
    }
}
