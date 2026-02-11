class Parent1{
    int a,b;
    void show(){
       System.out.println(a+" "+b);
    }
}
class Child1 extends Parent1{
    int c ; 
    void display(){
        System.out.println(c);
    }
    void getSum(){
        System.out.println(a+b+c);
    }
}




public class Main2 {
    public static void main(String[] args) {
        Parent1 P = new Parent1();
        P.a = 10;
        P.b = 20;
        P.show();
        Child1 C = new Child1();
        C.a = 100 ;
        C.b = 200 ;
        C.c = 300 ;
        C.show();
        C.display();
        C.getSum();

    }
}
