class StaticExample {
    void normal() {
        display();
        System.out.println("I am normal");
    }

    static void display() {
        show();
        System.out.println("I am static display");
    }

    static void show() {
        System.out.println("I am static show");
    }
}

public class Main4 {
    public static void main(String[] args) {
        StaticExample S1 = new StaticExample();
        StaticExample.display();
        StaticExample.show();
        // StaticExample.normal(); 
        // // Invalid: Cannot call instance method from class
        S1.normal(); // Valid: Calling instance method using the object S1
    }
}
