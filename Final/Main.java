// If use final in the class A then it will nnot work 

 class A{
     void display(){
        System.out.println("Class A Part");
    }
}
class B extends A{
    void show(){
        System.out.println("Class B Part");
    }
}


public class Main {
    public static void main(String[] args) {
        B B1 = new B();
        B1.show();
        B1.display();
    }
}
