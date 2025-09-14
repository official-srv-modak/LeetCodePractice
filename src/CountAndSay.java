import java.util.ArrayList;
import java.util.List;

public class CountAndSay {
    public static String countNumbers(String input)
    {
        String output = "";
        List<Integer> buffer = new ArrayList<Integer>();
        for(char ch : input.toCharArray()){
            int val = Integer.valueOf("" + ch);

            if(!buffer.isEmpty())
            {
                if(buffer.get(buffer.size() - 1) == val)
                    buffer.add(val);
                else
                {
                    output += String.valueOf(buffer.size()) + buffer.get(0);
                    buffer.removeAll(buffer);
                    buffer.add(val);
                }
            }
            else
                buffer.add(val);
        }
        if(buffer.isEmpty())
            return output;
        else {
            output += String.valueOf(buffer.size()) + buffer.get(0);
            return output;
        }
    }
    public static String countAndSay(int n) {
        String val = "1";
        for(int i = 0; i < n - 1; i++)
        {
            val = countNumbers(val);
        }
        return val;
    }
    public static void main(String[] args) {
//        System.out.println(countAndSay(4));
        System.out.println(countNumbers("0"));
    }
}
