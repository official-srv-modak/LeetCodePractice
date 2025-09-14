public class RomanToInteger {
    public static int getValue(char literal)
    {
        switch(literal)
        {
            case 'I':
                return 1;

            case 'V':
                return 5;

            case 'X':
                return 10;

            case 'L':
                return 50;

            case 'C':
                return 100;

            case 'D':
                return 500;

            case 'M':
                return 1000;
        }
        return 0;
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        for(int i = s.length() - 1; i >=0 ; i-- )
        {
            int present = getValue(s.charAt(i));
            if(prev <= present)
                sum += present;
            else
            {
                sum -= prev;
                int result = prev - present;
                sum += result;
            }
            prev = present;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
}
