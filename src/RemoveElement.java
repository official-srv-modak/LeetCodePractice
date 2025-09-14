import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static int[] removeELement(int [] arr, int remove)
    {
        int output [] = new int[arr.length -1];
        for(int i = 0, j = 0; i < output.length && j < arr.length; j++)
        {
            if(arr[j] != remove)
            {
                output[i] = arr[j];
                i++;
            }

        }
        return output;
    }

    public static int removeElement(int[] nums, int val) {
        for(Integer i : nums)
        {
            if(i == val)
            {
                nums = removeELement(nums, i);
            }
        }
        return nums.length;
    }

    public static void main(String [] args)
    {
        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
}
