import java.util.*;
import java.util.LinkedList;

public class KThFromEndLinkedList {
    static int getKthFromLast(Node head, int k) {
        // Your code here
        if(head == null)
            return -1;
        List<Integer> list = new ArrayList<>();

        Node currNode = head;

        while(currNode.next != null)
        {
            list.add(currNode.val);
            currNode = currNode.next;
        }

        if(k < list.size())
            return list.get(list.size() - k + 1);
        else
            return -1;
    }

    public static void main(String[] args) {
        Node list2 = new Node(1);

        append(2, list2);
        append(3, list2);
        append(4, list2);
        append(5, list2);
        append(6, list2);

        append(7, list2);

        append(8, list2);
        append(9, list2);


        System.out.println(getKthFromLast(list2, 2));
    }

    public static Node append(int val, Node head) // insert right
    {
        if(head == null)
        {
            Node newNode = new Node(val);
            head = newNode;
            return head;
        }

        Node currNode = head;
        while(currNode.next != null)
            currNode = currNode.next;

        Node newNode = new Node(val);
        currNode.next = newNode;

        return head;
    }
}
