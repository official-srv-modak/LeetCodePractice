public class AddTwoSumListNode {

    public static int[] add(int a, int b, int carry)
    {
        int sum = a + b + carry;

        carry = sum / 10;
        sum %= 10;

        return new int[]{carry, sum};
    }

    public static ListNode append(ListNode head, int... val)
    {
        for(int v : val)
            head = append(head, v);
        return head;
    }
    public static ListNode append(ListNode head, int val)
    {
        if(head == null)
        {
            head = new ListNode(val);
            return head;
        }

        ListNode cursor = head;

        while(cursor.next != null)
            cursor = cursor.next;

        cursor.next = new ListNode(val);

        return head;
    }

    public static void display(ListNode head)
    {
        ListNode cursor = head;
        while(cursor != null)
        {
            System.out.println(cursor.val);
            cursor = cursor.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode outputHead = null;
        int carry = 0;
        ListNode cursor1 = l1, cursor2 = l2;

        while(cursor1 != null && cursor2 != null)
        {
            int [] result = add(cursor1.val, cursor2.val, carry);

            carry = result[0];
            outputHead = append(outputHead, result[1]);

            cursor2 = cursor2.next;
            cursor1 = cursor1.next;
        }

        while(cursor1 != null)
        {
            int [] result = add(cursor1.val, 0, carry);

            carry = result[0];
            outputHead = append(outputHead, result[1]);
            cursor1 = cursor1.next;
        }

        while(cursor2 != null)
        {
            int [] result = add(cursor2.val, 0, carry);

            carry = result[0];
            outputHead = append(outputHead, result[1]);
            cursor2 = cursor2.next;
        }

        ListNode cursorOut = outputHead;
        while(cursorOut.next != null)
            cursorOut = cursorOut.next;

        if(carry != 0)
        {
            outputHead = append(outputHead, carry);
        }

        return outputHead;
    }
        public static void main(String[] args)
    {
        ListNode l1 = null;
        ListNode l2 = null;
        l1 = append(l1, 9);
        l2 = append(l2, 9);
        ListNode l3 = addTwoNumbers(l1, l2);

        display(l3);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }
}
