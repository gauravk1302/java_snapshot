interface A{
    public void show();
    
}
interface B{
    public void show();

}

class C implements A,B{
    public void show(){
        System.out.println("Multiple Inheritance");
    }
    public void print(){
        System.out.println("Class C");
    }
}
public class Test {

    public static void main(String[] args) {
        C c1 = new C();
        c1.show();
        c1.print();
    }
}