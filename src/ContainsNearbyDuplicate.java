import java.util.HashMap;

public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> buffer = new HashMap<>(); // value, index
        for(int i = 0; i < nums.length; i++)
        {
            if(buffer.containsKey(nums[i]) && Math.abs(buffer.get(nums[i]) - i) <= k)
                return true;
            buffer.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
    }
}
