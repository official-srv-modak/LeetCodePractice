public class DoublyLinkedList {

    public static DNode insertFirst(int val, DNode head)
    {
        if(head == null)
        {
            DNode newNode = new DNode(val);
            head = newNode;
            return head;
        }

        DNode newNode = new DNode(val);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }
    public static DNode append(int val, DNode head)
    {
        if(head == null)
        {
            DNode newDNode = new DNode(val);
            head = newDNode;
            return head;
        }

        DNode currDNode = head;

        while(currDNode.next != null)
        {
            currDNode = currDNode.next;
        }

        DNode newDNode = new DNode(val);
        newDNode.prev = currDNode;
        currDNode.next = newDNode;
        return head;
    }

    public static void display(DNode head)
    {
        DNode currDNode = head;

        if(head == null)
        {
            System.out.println("Empty");
        }

        while(currDNode != null)
        {
            System.out.println(currDNode.val);
            currDNode = currDNode.next;
        }
    }
    public static void main(String[] args)
    {
        DNode list1 = new DNode(0);
        DNode list2 = new DNode(5);

        System.out.println("List 1");
        display(list1);

        append(2, list2);
        append(1, list2);
        append(3, list2);
        append(9, list2);
        list2 = insertFirst(10, list2);
//        list2 = insertAtPosition(99, 3, list2);

        System.out.println("List 2");
        display(list2);
    }
}


class DNode{
    public int val;
    public DNode prev;
    public DNode next;

    public DNode(int val){
        this.val = val;
        prev = null;
        next = null;
    }
}