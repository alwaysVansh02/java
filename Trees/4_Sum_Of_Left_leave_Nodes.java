package Tree;

public class Sum_Of_Left_Leaves {
    ///  1. st Aproach Using DFS(depth FirstSearch ) in time-> O(n) and space -> O(n)
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    public int sumOfLeftLeaves(TreeNode root ){
        return getSum(root,false);
}
public int getSum(TreeNode root, boolean isLeftChild){
        if (root.left == null && root.right == null){
            return (isLeftChild) ? root.val : 0;
        }
        int sum =0;
        if (root.left !=null){
            sum += getSum(root.left, true);
        }
        if (root.right != null){
            sum += getSum(root.right, false);
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum_Of_Left_Leaves sum = new Sum_Of_Left_Leaves();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(10);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println("Sum Of left Leaves Node is:" + sum.sumOfLeftLeaves(root));
    }
}
