package Tree;

public class Find_Bottom_Left_tree {
    static class TreeNode {
        int val;
        Find_Bottom_Left_tree.TreeNode left;
        Find_Bottom_Left_tree.TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    int maxDepth = -1;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root){
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode node, int depth){
        if (node == null){
            return;
        }
        if (depth > maxDepth){
            maxDepth = depth; 
            ans = node.val;
        }
        dfs(node.left, depth +1);
        dfs(node.right, depth+1);
    }
    public static void main(String[] args) {
        Find_Bottom_Left_tree.TreeNode root = new Find_Bottom_Left_tree.TreeNode(1);
        root.left = new Find_Bottom_Left_tree.TreeNode(2);
        root.right = new Find_Bottom_Left_tree.TreeNode(3);
        root.left.left = new Find_Bottom_Left_tree.TreeNode(4);
        root.right.left = new Find_Bottom_Left_tree.TreeNode(5);
        root.right.right = new Find_Bottom_Left_tree.TreeNode(6);
        root.right.left.left = new Find_Bottom_Left_tree.TreeNode(7);

        Find_Bottom_Left_tree tree = new Find_Bottom_Left_tree();
        System.out.println("Bottom-left value: " + tree.findBottomLeftValue(root));
    }
}

