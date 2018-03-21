import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String encoded = Encoder.encode("zoo.jpg");
        Decoder.decode(encoded, "out.jpg");
    }
}
