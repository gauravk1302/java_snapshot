interface A{
    int r = 10;
    String name= "Amit";
}
interface B extends A{
    void display();
}

public class Main3 implements B {
    public void display(){
        System.out.println("Roll No. => " + r );
        System.out.println("Name => " + name );
    }
    
    public static void main(String[] args) {
        Main3 P = new Main3();
        P.display();
    }
}
