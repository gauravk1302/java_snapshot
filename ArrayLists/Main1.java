public class Main1 {
    private Object[] arr = new Object[100];
    private int size = 0;

    // Add element
    public void add(Object obj) {
        arr[size] = obj;
        size++;
    }

    // Get element at index
    public Object get(int index) {
        return arr[index];
    }

    // Clear all elements
    public void clear() {
        size = 0;
    }

    // Check if contains element
    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    // Check if list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get size
    public int size() {
        return size;
    }

    // Get hash code
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < size; i++) {
            hash = hash + arr[i].hashCode();
        }
        return hash;
    }

    public static void main(String[] args) {
        Main1 list = new Main1();

        System.out.println("isEmpty: " + list.isEmpty());
        System.out.println("size: " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());

        System.out.println("get(0): " + list.get(0));
        System.out.println("get(1): " + list.get(1));

        System.out.println("contains(20): " + list.contains(20));
        System.out.println("contains(99): " + list.contains(99));

        System.out.println("hashCode: " + list.hashCode());

        list.clear();
        System.out.println("After clear - size: " + list.size());
        System.out.println("isEmpty: " + list.isEmpty());
    }
}
