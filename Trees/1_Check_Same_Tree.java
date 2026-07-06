package Tree;

import javax.swing.tree.TreeNode;

public class Check_Same_Tree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null)
            return  true;
        if (p == null || q == null)
            return  false;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Check_Same_Tree checker = new Check_Same_Tree();
         TreeNode tree1 = new TreeNode(1);
         tree1.left = new TreeNode(2);
         tree1.right = new TreeNode(3);

         TreeNode tree2 = new TreeNode(1);
         tree2.left = new TreeNode(2);
         tree2.right = new TreeNode(3);
        System.out.println("Are the trees Same:" + checker.isSameTree(tree1, tree2));
    }
}
