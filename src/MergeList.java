import java.util.ArrayList;

public class MergeList {
    public static int size(ListNode list)
    {
        int size = 0;
        ListNode tempList = list;
        while(tempList != null)
        {
            tempList = tempList.next;
            size++;
        }
        return size;
    }

    public static ArrayList<Integer> insert(ListNode list)
    {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 0; list.next != null; i++)
        {
            output.add(list.val);
            list = list.next;
        }
        return output;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = list1;
        ListNode currentList = mergedList;
        if(list1!= null && list2 != null) {
            while (list1.next != null) {
                currentList.val = list1.val;
                currentList.next = list1.next;
                list1 = list1.next;
                currentList = currentList.next;
            }

            if (currentList != null && list2 != null) {
                currentList.next = list2;
            }

            currentList = mergedList;
            ListNode currentList1 = mergedList;

            while (currentList != null) {
                currentList1 = currentList;
                while (currentList1 != null) {
                    if (currentList.val > currentList1.val) {
                        int temp = currentList.val;
                        currentList.val = currentList1.val;
                        currentList1.val = temp;
                    }
                    currentList1 = currentList1.next;
                }
                currentList = currentList.next;

            }
        }
        else if(list1 == null){
            mergedList = list2;
        }
        else if(list2 == null)
        {
            mergedList = list2;
        }

        return mergedList;
    }

    public static ListNode insert(Integer... a)
    {
        ListNode list = new ListNode();
        ListNode head = list;
        for(int i = 0; i < a.length ; i++)
        {
            list.val = a[i];
            list.next = new ListNode();
            list = list.next;
        }
        return head;
    }

    public static ListNode append(ListNode head, Integer... a)
    {
        ListNode curr = head;
        while(curr.next != null)
            curr = curr.next;
        for(int val : a)
        {
            if(curr == null) {
                curr = new ListNode();
                curr = curr.next;
            }
            curr.val = val;
        }
        return head;
    }

    public static void display(ListNode head)
    {
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args)
    {
        display(mergeTwoLists(insert(1), null));
    }
}



class ListNode1 {
      int val;
      ListNode next;
      ListNode1() {}
      ListNode1(int val) { this.val = val; }
      ListNode1(int val, ListNode next) { this.val = val; this.next = next; }
  }
