class P1{
    static void display(){
        System.out.println("Static display of P1 class");
    }
}
class C1 extends P1{
    static void display(){
        System.out.println("Static display of C1 class");
    }
}


public class Main1 {
    public static void main(String[] args) {
        P1.display();
        C1.display();
    }
}
