public class Main4 {

    public static int divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}