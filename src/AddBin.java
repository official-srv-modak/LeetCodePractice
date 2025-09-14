public class AddBin {

    public static String parseBin(long number)
    {
        StringBuffer sb = new StringBuffer();

        while(number != 0)
        {
            long rem = number % 2;
            sb.append(rem);
            number = number / 2;
        }

        return sb.reverse().toString();
    }
    public static double parseNumber(String bin)
    {
        double sum = 0;
        for(int i = bin.length() - 1, j = 0; i >=0; i--, j++)
        {
            sum += Double.parseDouble(""+bin.charAt(i)) * Math.pow(2, j);
        }
        return sum;
    }

    public static String[] addBinLiteral(String l1, String l2)
    {
        String[] output = new String[]{"0", "0"};
        if(l1.equalsIgnoreCase("1") && l2.equalsIgnoreCase("1"))
        {
            output[0] = "1";
            output[1] = "1";
        }
        else if(l1.equalsIgnoreCase("1") && l2.equalsIgnoreCase("0"))
            output[0] = "1";
        else if(l1.equalsIgnoreCase("0") && l2.equalsIgnoreCase("1"))
            output[0] = "1";
        return output;
    }
    public static String addBinary(String a, String b) {
        StringBuffer output = new StringBuffer();
        String carry = "0";
        for(int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--)
        {
            String out = addBinLiteral(""+a.charAt(i), ""+b.charAt(j))[0];
            carry = addBinLiteral(""+a.charAt(i), ""+b.charAt(j))[1];

            output.append(out);
        }

        if(!carry.equalsIgnoreCase("0"))
            output.reverse().append(carry);
        return output.reverse().toString();
    }

    public static void main(String[] args)
    {
        System.out.println(addBinary("1", "11"));

//        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
    }
}
