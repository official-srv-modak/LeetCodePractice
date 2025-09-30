import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static boolean isContinuous(int a, int b)
    {
        // Assuming b > a
        if(b <= a)
            return false;

        if((b - a) == 1)
            return true;
        return false;
    }
    public static List<String> summaryRanges(int[] nums) {
        List<Integer> buffer = new ArrayList<Integer>();
        List<String> output = new ArrayList<>();
        if(nums.length == 0)
            return new ArrayList<>();
        buffer.add(nums[0]);
        for(int i = 1; i < nums.length; i++)
        {
            int lastIndexVal = buffer.get(buffer.size() - 1);
            if(isContinuous(lastIndexVal, nums[i]))
            {
                buffer.add(nums[i]);
            }
            else{
                String out = "";
                if(buffer.size() > 1)
                    out = buffer.get(0) +"->"+ buffer.get(buffer.size() - 1);
                else
                    out = String.valueOf(buffer.get(0));
                output.add(out);
                buffer.removeAll(buffer);
                buffer.add(nums[i]);
            }
        }
        if(buffer.isEmpty())
            return output;
        else{
            String out = "";
            if(buffer.size() > 1)
                out = buffer.get(0) +"->"+ buffer.get(buffer.size() - 1);
            else
                out = String.valueOf(buffer.get(0));
            output.add(out);
            return output;
        }
    }

    public static void main(String[] args)
    {
        List<String> output = summaryRanges(new int []{});
        for(String val : output)
            System.out.println(val);
    }
}
