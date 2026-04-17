import java.util.*;

class Student1 implements Comparable<Student1> {
    int r;
    String name;

    Student1(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public int compareTo(Student1 S1) {
        return this.r - S1.r;

    }
}

public class Main3 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(3, "Chandan"));
        list.add(new Student1(7, "Dhanush"));
        list.add(new Student1(1, "Arvind"));
        Collections.sort(list);
        for (Student1 i : list) {
            System.out.println(i.r + " " + i.name);
        }
    }
}