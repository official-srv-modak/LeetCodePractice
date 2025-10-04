import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseWordsInString {

    static Stack<String> stackSpace = new Stack<>();
    static Stack<String> stackWord = new Stack<>();
    public static void getSpace(String s){
        String space = "";
        String word = "";
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
        {
            if(!Character.isLetterOrDigit(chars[i]))
            {
                if(!word.isEmpty())
                {
                    stackWord.push(word);
                    word = "";
                }
                space += chars[i];
            }
            if(Character.isLetterOrDigit(chars[i]))
            {
                if(!space.isEmpty())
                {
                    stackSpace.push(space);
                    space = "";
                }
                word += chars[i];
            }
        }
        if(!space.isEmpty())
        {
            stackSpace.push(space);
            space = "";
        }
        if(!word.isEmpty())
        {
            stackWord.push(word);
            word = "";
        }
    }

    public static String reverseWords(String s) {

        getSpace(s);
        String output = "";

        while(!stackWord.isEmpty())
        {
            output += stackWord.pop();
            if(!stackSpace.isEmpty())
                output += stackSpace.pop();
        }
        return output;
    }

    public static void main(String[] args) {

        System.out.println(reverseWords("My name  is Sourav    Modak"));
    }
}
