interface Example {
    int n = 10;

    void display();
}

class Sample implements Example {
    public void display() {
        System.out.println("Display method");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.display();
        // canot access with the help of the object we made 
        System.out.println(Sample.n);
        System.out.println(Example.n);
    }
}
