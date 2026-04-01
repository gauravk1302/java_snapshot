import java.util.Scanner;

public class PalindromeCheck {

    public static void main(String[] args) {

        System.out.println("Name: Gaurav Kumar");
        System.out.println("Roll Number: 2400320100464");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int originalNum = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (originalNum == reverse)
            System.out.println(originalNum + " is a Palindrome.");
        else
            System.out.println(originalNum + " is not a Palindrome.");

        sc.close();
    }
}