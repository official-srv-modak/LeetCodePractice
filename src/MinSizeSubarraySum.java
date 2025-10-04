public class MinSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int length = Integer.MAX_VALUE;

        for(int i = 0, j = 0; Math.abs(i - j) < nums.length; j++)
        {
            if(j == nums.length - 1)
            {
                j = 0;
                i++;
            }
            int sum = 0;
            for(int p = i; p <= j; p++)
                sum += nums[p];
            if(sum == target)
            {
                if(i != j)
                    length = Math.abs(j - i);
                else
                    length = 1;
            }

            if(length < minLength)
                minLength = length;
        }
        return minLength == Integer.MAX_VALUE? 0: minLength;
    }

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[] {1,2,3,4,5}));
    }
}
