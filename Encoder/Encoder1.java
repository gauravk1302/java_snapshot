import java.util.Base64;

public class Encoder1{
    public static void main(String[] args) {
        String name = "Gaurav";
        String enstr = Base64.getEncoder().withoutPadding().encodeToString(name.getBytes());
        System.out.println(enstr);
    }
}