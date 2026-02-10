class Student  {
    int r ;
    String name ; 
    Student (int r , String name){
        this.r = r ;
        this.name = name ;
    }
    Student (Student S1){
        this.r = S1.r;
        this.name = S1.name;
    } 
    void display(){
        System.out.println(r);
        System.out.println(name);
    }
}



public class Main5 {
    public static void main(String[] args) {
        Student S1 = new Student(2, "Amit");
        S1.display();
        Student S2 = new Student(S1);
        S2.display();
    }
}
