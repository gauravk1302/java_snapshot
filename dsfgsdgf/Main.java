import java.util.*;

class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> e: map.entrySet() ){
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        
        return new ArrayList<>(); // bas return type satisfy karne ke liye
    }
}

public class Main {
    public static void main(String[] args) {
        
        // 👇 Example array
        int[] arr = {1, 2, 2, 3, 1, 1};
        
        Solution obj = new Solution();
        obj.countFreq(arr);
    }
}