import javax.crypto.spec.PSource;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static int removeDuplicates(int [] nums) {
        Set<Integer> remove = new HashSet<Integer>();

        for(int i : nums)
        {
            remove.add(i);
        }

        int index = 0;
        for (int val : remove) {
            nums[index++] = val;
        }

        return remove.size();
    }

    public static void main(String [] args)
    {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3, 3, 3}));
    }
}
