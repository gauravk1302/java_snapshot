class Overload{
    int add(int a , int b){
        return (a+b);
    }
    int add(int a , int b , int c ){
        return (a+b+c);
    }
    double add(int a , double b){
        return (a+b);
    }
}
public class Main{
    public static void main(String[] args) {
       Overload O1 = new Overload();
       
       double d = O1.add(2, 2.3);
       System.out.println(d);
    }
}