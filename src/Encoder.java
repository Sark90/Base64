import java.util.Base64;

public abstract class Encoder {
    public static String encode(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
}
