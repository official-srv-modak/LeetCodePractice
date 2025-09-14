import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray())
        {
            switch (ch)
            {
                case '(':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if(!stack.isEmpty() && stack.peek() == '(')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
                case ']':
                    if(!stack.isEmpty() && stack.peek() == '[')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
                case '}':
                    if(!stack.isEmpty() && stack.peek() == '{')
                        stack.pop();
                    else
                        stack.push(ch);
                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String [] args)
    {
        System.out.println(isValid("]"));
    }
}
