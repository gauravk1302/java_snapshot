class A{
    void methodA(){
        System.out.println("I am in grand parent class");
    }
}
class B extends A{
    void methodB(){
        System.out.println("I am in parent class");
    }
}
class C extends B{
    void methodC(){
        System.out.println("I am in child class");
    }
}
public class Main3{
    public static void main(String[] args) {
        C C1 = new C();
        C1.methodA();
        C1.methodB();
        C1.methodC();
    }
}