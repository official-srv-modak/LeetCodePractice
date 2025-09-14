import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static  int removeDuplicates(int[] nums) {
        Set<Integer> remove = new LinkedHashSet<Integer>();

        for(int val : nums)
        {
            remove.add(val);
        }


        int i = 0;
        for(int val : remove)
        {
            nums[i] = val;
            i++;
        }


        return remove.size();
    }

    public static void main(String [] args)
    {
        int [] val = new int[]{1, 1, 2};
        System.out.println(removeDuplicates(val));

        for(int v : val)
            System.out.println(v);
    }
}
