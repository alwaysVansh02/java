package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Even_Odd_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public boolean isEvenOddTree(TreeNode root){
        boolean isEven = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while ( !queue.isEmpty()){
            int len = queue.size();
            int prev = (isEven) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i< len; i++){
                TreeNode node = queue.poll();
                // even idx lvl -> value odd -> increasing order me
                // odd idx lvl -> value even-> decresing order me
                int cur = node.val;
                if ((isEven && (cur % 2 == 0 || cur <= prev)) ||
                        ( ! isEven && (cur % 2 != 0 || cur >= prev))){
                    return false;
                }
                prev = cur;
                 if (node.left != null){
                     queue.offer(node.right);
                 }
                 if (node.right != null){
                     queue.offer(node.left);
                 }
            }
                 isEven = !isEven;
        }
            return true;
    }

    public static void main(String[] args) {
        Even_Odd_Tree tree = new Even_Odd_Tree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        System.out.println("Is the tree an Even-Odd Tree? " + tree.isEvenOddTree(root));
    }
}
