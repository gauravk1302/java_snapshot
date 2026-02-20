interface Addition {
    int add(int a, int b);   
}
interface Subtraction {
    int subtract(int a, int b);  
}
class Calculator implements Addition, Subtraction {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int subtract(int a, int b) {
        return a - b;
    }
}


public class Main2 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int sum = cal.add(10, 5);
        int diff = cal.subtract(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}
