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


    public static void main(String [] args)
    {
        TreeNode tree = new TreeNode();
        tree = insert(1, tree);
        tree = insert(5, tree);
        tree = insert(2, tree);
        tree = insert(4, tree);

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
