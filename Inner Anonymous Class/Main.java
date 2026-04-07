class OuterClass {
    void display() {
        System.out.println("I am in outer class");
    }

    class InnerClass {
        void show() {
            System.out.println("I am in inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass OC = new OuterClass();
        OC.display();
        OuterClass.InnerClass IC = OC.new InnerClass();
        IC.show();
    }
}
// In this if there is inner class then jo compile file hogi uska naam mein
// outer class and inner class separate hongi by $ sigh