class P{
    void display(){
        System.out.println("Display of P class");
    }
}

class C extends P{
    void display(){
        System.out.println("Display of C class");
    }
}

public class Dynamic {
    public static void main(String[] args) {
        
        P obj = new C();   // Dynamic Method 
        obj.display();     // C ka method call hoga
        
    }
}
