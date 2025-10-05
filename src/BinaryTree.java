import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public static TreeNode insert(int val, TreeNode root)
    {
        if(root == null)
        {
            TreeNode node = new TreeNode(val);
            root = node;
            return root;
        }
        if(val < root.val)
            root.left = insert(val, root.left);
        else
            root.right = insert(val, root.right);
        return root;
    }

    public static void preOrder(TreeNode node)
    {
        if(node == null)
            return;
        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void postOrder(TreeNode node)
    {
        if(node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }

    public static void inOrder(TreeNode node)
    {
        if(node == null)
            return;
        inOrder(node.left);
        System.out.println(node.val);
        inOrder(node.right);
    }

    public static TreeNode levelOrder(TreeNode node, int val)
    {
        if(node == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            TreeNode node1 = queue.poll();
            System.out.println(node1.val);
            if(node1.left != null)
                queue.add(node1.left);
            if(node1.right != null)
                queue.add(node1.right);
        }
        return null;
    }

    public static TreeNode BFSLevelOrder(TreeNode node, int val)
    {
        if(node == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            TreeNode node1 = queue.poll();
            if(node1.val == val)
                return node1;
            if(node1.left != null)
                queue.add(node1.left);
            if(node1.right != null)
                queue.add(node1.right);
        }
        return null;
    }

    public static TreeNode DFSPreOrder(TreeNode node, int val)
    {
        if(node == null)
            return null;

        if(node.val == val)
            return node;

        TreeNode nnode = DFSPreOrder(node.left, val);
        if(nnode != null && nnode.val == val)
            return nnode;

        nnode = DFSPreOrder(node.right, val);
        if(nnode != null && nnode.val == val)
            return nnode;

        return null;
    }

    public static TreeNode DFSInOrder(TreeNode node, int val)
    {
        if(node == null)
            return null;

        TreeNode nnode = DFSInOrder(node.left, val);
        if(nnode != null && nnode.val == val)
            return nnode;

        if(node.val == val)
            return node;

        nnode = DFSInOrder(node.right, val);
        if(nnode != null && nnode.val == val)
            return nnode;

        return null;
    }

    public static TreeNode DFSPostOrder(TreeNode node, int val)
    {
        if(node == null)
            return null;

        TreeNode node1 = DFSPostOrder(node.left, val);
        if(node1 != null && node1.val == val)
            return node1;

        node1 = DFSPostOrder(node.right, val);
        if(node1 != null && node1.val == val)
            return node1;

        if(node.val == val)
            return node;

        return null;
    }


    public static void main(String [] args)
    {
        TreeNode tree = new TreeNode();
        tree = insert(1, tree);
        tree = insert(5, tree);
        tree = insert(2, tree);
        tree = insert(4, tree);

        TreeNode node = DFSPostOrder(tree, 2);

        try {
            System.out.println("found : "+node.val);
        }catch (NullPointerException e)
        {
            System.out.println("Not found");
        }

        inOrder(tree);

    }
}

class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val)
    {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
