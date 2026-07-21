package Tree;
///  time->O(n) and space->O(H) H->height of tree
public class Delete_Leaf_With_Given_Target {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) {
            return root;
        }
        // post order travesal
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);
        // null return krna agr target leaf found ho jae
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {
        Delete_Leaf_With_Given_Target tree = new Delete_Leaf_With_Given_Target();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);

        System.out.println("Tree before removing target leaves:");
        printTree(root);

        root = tree.removeLeafNodes(root, 2);

        System.out.println("\nTree after removing target leaves:");
        printTree(root);
    }
}


