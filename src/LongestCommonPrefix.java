public class LongestCommonPrefix {

    public static int getMinLength(String[] strs) {
        int minSize = strs[0].length();
        for(String s : strs)
            if(s.length() < minSize)
                minSize = s.length();
        return minSize;
    }
    public static String longestCommonPrefix(String[] strs) {

        int minLen = getMinLength(strs);
        String prefix = "";

        for(int i = 0; i < minLen; i++)
        {
            Character common = strs[0].charAt(i);
            for(int j = 0; j < strs.length; j++)
            {
                if(common != strs[j].charAt(i))
                {
                    common = null;
                    break;
                }
            }
            if(common != null)
                prefix += common + "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
