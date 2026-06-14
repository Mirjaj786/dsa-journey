
import java.util.*;

public class CountFrequency {

    public static void countFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // for (int ele : arr) {
        //     if (map.containsKey(ele)) {
        //         map.put(ele, map.get(ele) + 1);
        //     } else {
        //         map.put(ele, 1);
        //     }
        // }
        for (int ele : arr) {
            
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            
        }

        // for (int key : map.keySet()) {
        //     System.out.println(map.get(key));
        // }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 6, 9, 4, 2, 5, 1, 1, 5, 4};
        countFreq(arr);
    }
}
