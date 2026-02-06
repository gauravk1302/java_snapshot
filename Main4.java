class StaticExample {
    void normal() {
        display();
        System.out.println("I am normal");
    }

    static void display() {
        show();
        System.out.println("I am staic display");
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
        // Object will be made

    }
}
