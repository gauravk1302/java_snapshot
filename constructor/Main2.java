class Addition {
    int a, b;

    Addition() {
        this.a = 0;
        this.b = 0;
    }

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Also a example of constructor overloading
    void calsum(Addition A1, Addition A2) {
        Addition S = new Addition();
        // calls default constructor
        S.a = A1.a + A2.a;
        S.b = A1.b + A2.b;
        System.out.println(S.a);
        System.out.println(S.b);
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Addition obj1 = new Addition(10, 20);
        obj1.display();
        Addition obj2 = new Addition(100, 200);
        obj2.display();
        obj1.calsum(obj1, obj2);
    }
}
