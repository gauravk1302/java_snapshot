import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        long number = S.nextLong();
        long reversed = 0;
        
        while (number != 0) {
            long digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Reversed number: " + reversed);
        S.close();
    }
}
