class MyException extends Exception {

    MyException(String msg){
        super(msg);
    }

}

public class Test {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 2;

            if(b == 0){
                throw new MyException("Cannot divide by zero");
            }

            int c = a/b;
            System.out.println(c);

        }

        catch(MyException e){
            System.out.println(e.getMessage());
        }

    }

}