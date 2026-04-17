import java.util.*;

class Employee{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary=salary;
    }

}
public class Main2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(11,"Gaurav",100000));
        list.add(new Employee(2,"Akhil",25000));
        for(Employee e : list){
            System.out.println(e.id+" "+ e.name + " "+ e.salary);
        }
        
    }
    
}