class Example {
    int add(int a , int b ){
        return a+b;
    }
}


public class Main {
    public static void main(String[] args) {
        Example E1 = new Example();
        int res = E1.add(10, 20);
        System.out.println(res);
    }
}
