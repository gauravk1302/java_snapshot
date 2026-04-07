class Example1<T>{
    void display(T a){
        System.out.println(a);
    }
}


public class Main1 {
    public static void main(String[] args) {
        Example1<Integer> E1 = new Example1<>();
        E1.display(10);
        Example1<Float> E2 = new Example1<>();
        E2.display(3.4f);
        Example1<String> E3 = new Example1<>();
        E3.display("Java Programming");
    }
}
