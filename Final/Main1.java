
class Example{
    static int age = 10 ;
    //if use final here and then try to increase the value in main function then it will not work
}

public class Main1 {
   final int n=10;
   public static void main(String[] args) {
    // Main1 M = new Main1();
    // System.out.println(M.n);
    System.out.println(Example.age);
    //int b = (Example.age++)
    //it will not work 
   }
}
