import java.util.HashMap;
import java.util.Map;

public class GetMiddleLinkedList {

    public static Node append(Node head, Integer... a)
    {
        Node curr = head;

        for(int val : a)
        {
            if(curr == null)
                curr = new Node();
            curr.data = val;
            curr.next = new Node();
            curr = curr.next;
        }
        return head;
    }

    static int getMiddle(Node head) {
        // code here

        if(head == null){
            return 0;
        }
        if(head.next == null)
        {
            return 1;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        Node currNode = head;

        for(int i = 0; currNode.next != null; i++)
        {
            map.put(i,currNode.data);
            currNode = currNode.next;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.println(entry.getValue());
        }

        return map.get(map.size() % 2 == 0? (map.size() + 1)/2:map.size()/2);
    }

    public static void main(String[] args) {
        Node node = new Node();
        append(node, 20, 15, 2, 13, 2, 10, 13, 3, 2, 6);
        System.out.println(getMiddle(node));
    }

    static class Node {
        int data;
        Node next;

        Node(){}
        Node(int x) {
            data = x;
            next = null;
        }
    }
}
