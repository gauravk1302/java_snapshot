
public class Main1 {
    static void display() throws IndexOutOfBoundsException {
        System.out.println("Inside display");
        throw new IndexOutOfBoundsException("Array size is not proper");
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
