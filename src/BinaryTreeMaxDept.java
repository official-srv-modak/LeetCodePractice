import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeMaxDept {

    static int max = 0;
    static int count = 1;
    public static void levelOrder(TreeNode root)
    {
        if(root == null)
            return;

        TreeNode node = root;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(node);

        while(!queue.isEmpty())
        {
            TreeNode nnode = queue.poll();

            if(nnode.left == null && nnode.right == null)
            {
                if(count > max)
                    max = count;
                count = 1;
            }
            if(nnode.left != null)
                queue.add((nnode.left));
            if(nnode.right != null)
                queue.add((nnode.right));
            count++;
        }
    }
    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;

        TreeNode node = root;

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        int maxDepth = 1 + Math.max(leftDepth, rightDepth);

        return maxDepth;
    }
    public static void main(String [] args)
    {
        TreeNode root = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);

        node3.left = node4;
        node3.right = node5;

        root.left = node2;
        root.right = node3;


        System.out.println(maxDepth(root));
    }
}
