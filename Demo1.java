class NumberData {
    private int num;

    // Setter
    public void setNum(int num) {
        this.num = num;
    }

    // Getter
    public int getNum() {
        return num;
    }
}

public class Demo1{
    public static void main(String[] args) {

        // Creating first instance
        NumberData obj1 = new NumberData();
        obj1.setNum(10);

        // Creating second instance
        NumberData obj2 = new NumberData();
        obj2.setNum(20);

        // Calculating sum using getters
        int sum = obj1.getNum() + obj2.getNum();

        // Printing sum
        System.out.println("Sum of two numbers: " + sum);
    }
}