import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //Manually
        // int a = 4;
        // float area = (3.14f*a*a);
        // System.out.println(area);
        
        //UserInput
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius");
        int a = S.nextInt();
        float area = (3.14f*a*a);
        System.out.println("The Area of the Circle is : "+area);
    }
}
