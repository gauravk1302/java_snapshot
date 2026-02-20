abstract class Example{
    abstract void display();
    void show(){
        System.out.println("Show in abstract class");
    }
}
// If extending this class then there are two ways one is define the display method in the Example class or make the extending class abstract 
class Test extends  Example{
  void display(){
    System.out.println("Display in test class");
  }
}

public class Main1 {
    public static void main(String[] args) {
        Test T = new Test();
        T.display();
        T.show();

    }
}
