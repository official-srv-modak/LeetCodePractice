public class LinkedList {

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

    public static Node insertFirst(int val, Node head)
    {
        if(head == null)
        {
            Node newNode = new Node(val);
            head = newNode;
            return head;
        }

        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

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
            System.out.println(currNode.val);
            currNode = currNode.next;
        }
    }

    public static Node insertAtPosition(int val, int pos, Node head)
    {
        if(head == null)
        {
            if(pos != 0)
            {
                System.out.println("Empty");
                Node currNode = new Node(val);
                head = currNode;
                return head;
            }
        }
        Node currNode = head;
        Node prevNode = head;
        for(int i = 0; i <= pos && currNode.next != null; i++)
        {
            if(i == pos)
            {
                Node newNode = new Node(val);
                prevNode.next = newNode;
                newNode.next = currNode;
                return head;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }
        return head;
    }

    public static void main(String[] args)
    {
        Node list1 = new Node();
        Node list2 = new Node(5);

        System.out.println("List 1");
        display(list1);

        append(2, list2);
        append(1, list2);
        append(3, list2);
        append(9, list2);
        list2 = insertFirst(10, list2);
        list2 = insertAtPosition(99, 3, list2);

        System.out.println("List 2");
        display(list2);
    }
}

class Node {
    public int val;
    public Node next;
    public Node(int val)
    {
        this.val = val;
        this.next = null;
    }

    public Node()
    {
        this.next = null;
    }
}
