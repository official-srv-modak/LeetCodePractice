package testbinarytree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree1 {

    static List<Integer> sortedList = new ArrayList<>();
    public static TreeNode insert(TreeNode root, int val)
    {
        if(root == null)
        {
            root = new TreeNode(val);
            return root;
        }

        if(val < root.val)
            root.left = insert(root.left, val);

        if(val > root.val)
            root.right = insert(root.right, val);

        return root;

    }

    public static void inOrder(TreeNode root)
    {
        if(root == null)
            return;

        inOrder(root.left);

        System.out.println(root.val);

        inOrder(root.right);

    }

    public static void inOrderRet(TreeNode root)
    {
        if(root == null)
            return;

        inOrder(root.left);

        sortedList.add(root.val);


        inOrder(root.right);

    }

    public static void sort(int[] arr)
    {
        TreeNode node = new TreeNode(arr[0]);

        for(int i = 1; i < arr.length; i++)
        {
            node = insert(node, arr[i]);
        }
        inOrderRet(node);

    }

    public static void main(String[] args) {
        /*TreeNode node = new TreeNode(12);

        // new int[]{98,5,2,4,6,12,8,12}
        node = insert(node, 98);
        node = insert(node, 5);
        node = insert(node, 2);
        node = insert(node, 4);
        node = insert(node, 6);
        node = insert(node, 12);
        node = insert(node, 8);

        inOrder(node);*/

        sort(new int[]{98,5,2,4,6,12,8,12});

    }
}
