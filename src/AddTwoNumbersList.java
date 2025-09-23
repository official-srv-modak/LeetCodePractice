import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersList {

    // output carry in the carry variable and give the sum in the return
    public static int[] addTwoNumbers(Integer a, Integer b, Integer carry)
    {
        int sum = a + b + carry;

        carry = sum / 10;
        sum %= 10;

        return new int[]{carry, sum};
    }

    public static List<Integer> addTwoNumbers(List<Integer>  l1, List<Integer>  l2) {
        List<Integer> output = new ArrayList<>();

        int carry = 0;
        int i = 0, j = 0;
        for(i = 0, j = 0; i < l1.size() && j < l2.size(); i++, j++)
        {
            int[] result = addTwoNumbers(l1.get(i), l2.get(j), carry);
            carry = result[0];
            output.add(result[1]);
        }
        for(; i < l1.size(); i++)
        {
            int[] result = addTwoNumbers(l1.get(i), 0, carry);
            carry = result[0];
            output.add(result[1]);
        }

        for(; j < l2.size(); j++)
        {
            int[] result = addTwoNumbers(l2.get(i), 0, carry);
            carry = result[0];
            output.add(result[1]);
        }

        if(carry != 0)
        {
            output.add(carry);
        }
        return output;
    }

    public static void display(List<Integer> list)
    {
        for(Integer val : list)
        {
            System.out.println(val);
        }
    }

    public static List<Integer> append(int... a)
    {
        List<Integer> output = new ArrayList<>();
        for(int val : a)
            output.add(val);
        return output;
    }

    public static void main (String [] args){

//        display(addTwoNumbers(append(2,4,3), append(5,6,4)));

        display(addTwoNumbers(append(9,9,9,9,9,9,9), append(9,9,9,9)));
    }
}
