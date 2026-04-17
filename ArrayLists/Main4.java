import java.util.*;

class Employee implements Comparable<Employee> {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        // 1. Salary pe sort
        int res = Double.compare(this.salary, e.salary);

        // 2. Salary same ho toh id
        if (res == 0) {
            res = Integer.compare(this.id, e.id);
        }

        // 3. Id bhi same ho toh name
        if (res == 0) {
            res = this.name.compareTo(e.name);
        }

        return res;
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Rahul", 50000));
        list.add(new Employee(102, "Amit", 50000));
        list.add(new Employee(101, "Zara", 50000));
        list.add(new Employee(103, "Neha", 30000));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}