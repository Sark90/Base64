import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public abstract class Decoder {

    public static void decode(String encoded, String decodedFile) {
        byte[] bytes = Base64.getDecoder().decode(encoded);
        try(FileOutputStream fos = new FileOutputStream(decodedFile)) {
            fos.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
