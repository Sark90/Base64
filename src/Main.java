import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = "Hello, World!".getBytes("UTF-8");
        String encoded = Encoder.encode(bytes);
        System.out.println("Encoded: " + encoded);
        byte[] decoded = Decoder.decode(encoded);
        System.out.print("Decoded: ");
        for(byte b: decoded) {
            System.out.print((char) b);
        }
    }
}
