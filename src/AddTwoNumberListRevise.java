import java.util.*;

public class AddTwoNumberListRevise {
    static int[] addTwoNum(int a, int b, int carry)
    {
        int sum = a + b + carry;

        carry = sum / 10;
        sum = sum % 10;

        return new int[]{carry,sum};
    }

    public int pop(Node head, int val)
    {
        if(head == null)
        {
            head = new Node(val);
            return 0;
        }

        Node currNode = head;
        Node prev = head;
        while(currNode.next != null)
        {
            prev = currNode;
            currNode = currNode.next;
        }
        prev.next = null;
        return currNode.data;
    }
    public static Node addTwoLists(Node head1, Node head2) {
        // code here
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> stackOut = new Stack<>();

        Node curr1 = head1;
        Node curr2 = head2;

        while (curr1 != null) {
            s1.push(curr1.data);
            curr1 = curr1.next;
        }

        while (curr2 != null) {
            s2.push(curr2.data);
            curr2 = curr2.next;
        }

        int carry = 0;

        while (!s1.isEmpty() && !s2.isEmpty()) {

            int[] result = addTwoNum(s1.pop(), s2.pop(), carry);
            carry = result[0];
            stackOut.push(result[1]);
        }

        while (!s1.isEmpty()) {
            int[] result = addTwoNum(s1.pop(), 0, carry);
            carry = result[0];
            stackOut.push(result[1]);
        }

        while (!s2.isEmpty()) {
            int[] result = addTwoNum(0, s2.pop(), carry);
            carry = result[0];
            stackOut.push(result[1]);
        }

        if (carry != 0) {
            stackOut.push(carry);
        }

        Node out = null;
        Node currOut = null;
        while(!stackOut.isEmpty())
        {
            if(out == null && stackOut.peek() == 0)
            {
                stackOut.pop();
                continue;
            }
            if(out == null)
            {
                currOut = new Node(stackOut.pop());
                out = currOut;
            }
            else{
                currOut.next = new Node(stackOut.pop());
                currOut = currOut.next;
            }
        }
        return out;
    }

    public static Node append(Node head, Integer... a)
    {
        Node curr = head;
        List<Integer> values = Arrays.asList(a);
        for(int val : values)
        {
            if(curr == null)
                curr = new Node(0);
            curr.data = val;
            if(values.indexOf(val) != values.size() - 1)
            {
                curr.next = new Node(0);
                curr = curr.next;
            }
        }
        return head;
    }

    public static void display(Node head)
    {
        if(head == null)
        {
            System.out.println("Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null)
        {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(0);
        Node n2 = new Node(0);

        n1 = append(n1, 4, 5);
        n2 = append(n2, 3, 4, 5);

        Node output = addTwoLists(n1, n2);

        display(output);
    }
}
