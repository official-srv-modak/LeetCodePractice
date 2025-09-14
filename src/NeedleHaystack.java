public class NeedleHaystack {
    public static int strStr(String haystack, String needle) {
        int output = -1;
        if(haystack.contains(needle))
        {
            for(int i = 0, j = 0; i < needle.length() && j < haystack.length();)
            {
                if(needle.charAt(i) != haystack.charAt(j))
                {
                    j = j - i + 1;
                    i = 0;
                }
                if(needle.charAt(i) == haystack.charAt(j))
                {
                    if(i == needle.length() - 1)
                    {
                        output = j - i;
                    }
                    i++;
                    j++;
                }
                else
                {
                    j++;
                }

            }
        }

        return output;
    }

    public static void main(String[] args)
    {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}
