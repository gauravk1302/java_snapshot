public class Swapping {
    public static void main(String[] args) {
        int a = 34;
        int b = 54;

        int temp;

        System.out.println("Before Swapping:"+ a +" "+ b );

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping:"+ a +" " + b);
    }
}
