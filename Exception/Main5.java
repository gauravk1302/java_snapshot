class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Main5 {

    static int divide(int a, int b) throws MyException {

        if (b == 0) {
            throw new MyException("Cannot divide by zero");
        }

        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}