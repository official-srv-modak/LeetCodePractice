public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        return s.split(" ")[s.split(" ").length - 1].length();
    }

    public static void main(String[] args)
    {
        System.out.println(lengthOfLastWord("hello world"));
    }
}
