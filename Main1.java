class Student {
    int r ; 
    String  name ;
    static String college = "ABES";
    static int count  = 0 ; 
    void getdata(int r , String name){
       this.r  = r ; 
       this.name =  name ;
    }
    void display(){
        System.out.println(r);
        System.out.println(name);
        System.out.println(college);
        System.out.println(count);
    }
}


public class Main1 {
    public static void main(String[] args) {
        Student S = new Student();

        S.getdata(1, "Kalu");
        System.out.println(Student.count);
        S.display();
        System.out.println(Student.college);

       
    }
}
