import java.util.Base64;

public abstract class Decoder {
    public static byte[] decode(String s) {
        return Base64.getDecoder().decode(s);
    }
}
