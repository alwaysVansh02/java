package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Add_One_Row_To_Tree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val= val;
        }
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode newRoot = null;
        if (depth == 1) {
             newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        } 
        newRoot = dfs(root,1,depth,val);
        return newRoot;
    }
    public TreeNode dfs(TreeNode root, int currDepth,int depth, int val){
        if (root == null){
            return  root;
        }
        if (currDepth == depth - 1){
            TreeNode newLeft = new TreeNode(val);
            newLeft.left = root.left;
            root.left = newLeft;

            TreeNode newRight = new TreeNode(val);
            newRight.right = root.right;
            root.right = newRight;

            return root;
        }
        dfs(root.left, currDepth + 1, depth, val);
        dfs(root.right, currDepth + 1, depth, val);

        return root;
    }
    public static void printLevelOrder(TreeNode root) {

        if (root == null)
            return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();

            System.out.print(node.val + " ");

            if (node.left != null)
                queue.offer(node.left);

            if (node.right != null)
                queue.offer(node.right);
        }

        System.out.println();
    }
    public static void main(String[] args) {

        Add_One_Row_To_Tree tree = new Add_One_Row_To_Tree();

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(1);

        root.right.left = new TreeNode(5);

        System.out.println("Original Tree (Level Order):");
        printLevelOrder(root);

        root = tree.addOneRow(root, 9, 3);

        System.out.println("\nTree After Adding One Row:");
        printLevelOrder(root);
    }
}

