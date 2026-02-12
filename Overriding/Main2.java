class P1
{
    static void display()
    {
        System.out.println("Static display of P1 class");

    }
    void info()
    {
        System.out.println("normal method of p1 class");
    }
}
class C1 extends P1
{
    static void display ()
    {
        System.out.println("Static display of C1 class");
    }
    void info()
    {
        System.out.println("normal method of C1 class");
    }
}

public class Main2
{
    public static void main (String[] args)
    {
        P1.display();
        C1.display();
        C1 C = new C1();
        C.info();

    }
}