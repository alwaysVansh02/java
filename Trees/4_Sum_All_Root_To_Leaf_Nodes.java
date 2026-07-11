package Tree;

public class Sum_Root_To_Leaf_Numbers {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    int sum =0;
    public int sumNumbers(TreeNode root){
        sumRootToLeafNumber(root, 0);
        return sum;
    }
  public void  sumRootToLeafNumber(TreeNode root, int currNum){
        if (root == null ){
            return ;
        }
        currNum = currNum * 10 + root.val;
        if (root.left == null && root.right == null) {
            sum += currNum;
            return;
        }
            // left curr ke lie
            sumRootToLeafNumber(root.left, currNum);
            // right curr k lie
            sumRootToLeafNumber(root.right, currNum);
        }


    public static void main(String[] args) {
        Sum_Root_To_Leaf_Numbers tree = new Sum_Root_To_Leaf_Numbers();

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.right = new TreeNode(0);
        root.left.left = new TreeNode(5);
        root.left.right= new TreeNode(1);

        System.out.println(" The Sum of all root to leaf node is:" + tree.sumNumbers(root));
    }
}
