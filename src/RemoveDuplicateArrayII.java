public class RemoveDuplicateArrayII {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        int prev = -10001;
        int j = 0;
        for(int val : nums)
        {
            if(prev == val)
                count++;
            else
                count = 0;
            if(count < 2)
            {
                nums[j++] = val;
            }
            prev = val;
        }

        return j;
    }

    public static void main(String[] args)
    {
        int [] nums = {0,0,1,1,1,1,2,3,3};

        int output = removeDuplicates(nums);
        System.out.println(output);

        for(int val : nums)
            System.out.println(val);
    }
}
