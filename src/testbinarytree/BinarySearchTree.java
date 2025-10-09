package testbinarytree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

    public static List<Integer> output = new ArrayList<>();
    public static TreeNode insertInBinaryTree(TreeNode root, int val)
    {
        if(root == null)
        {
            root = new TreeNode(val);
            return root;
        }
        if(val < root.val)
            root.left = insertInBinaryTree(root.left, val);
        if(val > root.val)
            root.right = insertInBinaryTree(root.right, val);

        return root;
    }

    public static void inOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        if(root.left != null)
            inOrder(root.left);
        System.out.println(root.val);
        if(root.right != null)
            inOrder(root.right);
    }

    public static void inOrderInt(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        if(root.left != null)
            inOrderInt(root.left);
        output.add(root.val);
        if(root.right != null)
            inOrderInt(root.right);
    }

    public static void sort(int arr[])
    {
        TreeNode node = new TreeNode(arr[0]);
        for(int val : arr)
        {
            node = insertInBinaryTree(node, val);
        }

        inOrderInt(node);
    }

    public static void main(String[] args) {

        /*TreeNode node = new TreeNode(5);
        node = insertInBinaryTree(node, 2);
        node = insertInBinaryTree(node, 7);
        node = insertInBinaryTree(node, 13);
        node = insertInBinaryTree(node, 1);

        inOrder(node);*/


        sort(new int[]{98,5,2,4,6,12,8,2,12});

        for(int val : output)
            System.out.println(val);
    }
}
