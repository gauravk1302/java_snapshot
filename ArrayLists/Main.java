import java.util.*;

public class Main {
   public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(5);
    list.add(15);
    list.add(43);
    list.add(12);

    System.out.println("Original List:" + list);
    Collections.sort(list);
    System.out.println("Sorted List:" + list);
    Collections.sort(list,Comparator.reverseOrder());
    System.out.println("Reverse Sorted List:" + list);
   } 
}
