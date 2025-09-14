public class Reverse32Bit {
    public static int reverse(int x) {
        int sum = 0;
        double lower = -1 * Math.pow(2, 31);
        double upper = Math.pow(2, 31) - 1;
        System.out.println(lower + " "+ upper);
        while(x != 0)
        {
            int rem = x % 10;
            if (sum > upper / 10 || sum < lower / 10)
                return 0;
            sum = sum * 10 + rem;
            x = x/10;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse(1534236469));
    }
}
