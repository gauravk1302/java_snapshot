import java.util.Base64;

public class Decoder{
    public static void main(String[] args) {
        String name = "Arvind Kharwal";
        String enstr = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println("Encoded ->" + enstr);
        byte[] b  = Base64.getDecoder().decode(enstr);
        String decodeStr = new String(b);
        System.out.println("Decoded ->" + decodeStr);
    }
}