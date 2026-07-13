package Tree;
// time -> O(n^2), space -> O(h)+O(n)
public class Smallest_String_Starting_Frm_Leaf {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
        }
    }
    String smallestString = "";
    public String smallestFromLeaf(TreeNode root){
        dfs(root, "");
        return smallestString;
    }
    public void dfs(TreeNode root, String currString){
        if (root == null){
            return;
        }
        char ch = (char) (root.val + 'a');
        currString = ch + currString;
        if (root.left == null && root.right ==  null){
            if (smallestString == "" || smallestString.compareTo(currString) > 0){
                smallestString= currString;
            }
            return;
        }
        dfs(root.left, currString);
        dfs(root.right, currString);
    }

    public static void main(String[] args) {
        Smallest_String_Starting_Frm_Leaf tree = new Smallest_String_Starting_Frm_Leaf();

        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);

        System.out.println(" Smallest  string from leaf node is:  " + tree.smallestFromLeaf(root));
    }
}
