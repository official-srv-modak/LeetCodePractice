package rough;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 2, 7, 3, 2, 5};

        System.out.println(findDuplicate(arr));
    }

    private static int findDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(arr[i]))
                return map.get(arr[i]);

            map.put(arr[i], i);
        }
        return -1;
    }
}
