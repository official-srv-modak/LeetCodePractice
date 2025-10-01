import java.util.HashSet;

public class TwoSumPresent {
    static boolean isPresent(int arr[], int target)
    {
        for(int val : arr)
        {
            if(val == target)
                return true;
        }
        return false;
    }

    static boolean twoSum(int arr[], int target) {
        // code here
        int[] buffer = new int[arr.length];
        for(int i = 0; i < buffer.length; i++)
        {
            buffer[i] = Integer.MIN_VALUE;
        }
        for(int i = 0; i < arr.length; i++)
        {
            int val = arr[i];
            if(isPresent(buffer, target - val))
                return true;
            buffer[i] = val;
        }
        return false;
    }

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;  // found a pair
            }
            seen.add(num);
        }

        return false; // no pair found
    }

    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[]{1, -2, 1, 0, 5}, 0));
    }
}
