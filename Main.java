class Rectangle {
    int width, length;

    void getdata(int x, int y) {
        length = y;
        width = x;
    }

    int area() {
        int a = length * width;
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.getdata(3, 5);
        int res = R.area();
        System.out.println("The area of rectangle is : " + res);
    }
}
