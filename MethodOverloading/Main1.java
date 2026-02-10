class Overload{
    int add(int a , int b){
        return (a+b);
    }
    int add(int a , int b , int c ){
        return (a+b+c);
    }
    void add1(int a , long b){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Main1{
    public static void main(String[] args) {
       Overload O1 = new Overload();
       
       O1.add1(2, 20);
    }
}