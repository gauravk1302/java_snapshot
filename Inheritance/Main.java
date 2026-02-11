class Parent{
    void display(){
        System.out.println("I am in display() of parent class");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("I am in private method of parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("I am in show () of child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent P = new Parent();
        P.display();
        Child C= new Child();
        C.display();
        C.show();

        // C.privateMethod();
        // Not Accessible

        //If wanted to access, call this method in the class which is accessible by the child class 
    }
}
