abstract class Calculator{
    abstract int add(int a , int b);
    abstract int subtract(int a, int b);
}
class SimpleCaculator extends Calculator{
    int add (int a , int b){
        return a+b ;
    }

    int subtract(int a, int b){
        return a-b;
    }
}
public class Main2{
    public static void main(String[] args){
        SimpleCaculator cal = new SimpleCaculator();

        int sum = cal.add(12, 15);
        int diff = cal.subtract(15, 10);

        System.out.println(sum);
        System.out.println(diff);
    }
}