import java.util.Base64;

public class Encoder{
    public static void main(String[] args) {
        String name = "Gaurav Kumar";
        String enstr = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(enstr);
    }
}

//if the output has "=" then it has padding (padded string) less than 3 byte