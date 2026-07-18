package Tree;

public class Evaluate_Boolean_Binary_Tree {
    // time->O(n) and space->O(H) H->height of tree
    static class Treenode{
        int val;
        Treenode left,right;
            Treenode(int val){
                this.val = val;
            }
    }
    public boolean evaluateTree(Treenode root){
        if (root.left == null && root.right == null){
            return (root.val == 1) ? true: false;
        }
        boolean left = false;
        boolean right = false;
        if (root.left != null){
            left = evaluateTree(root.left);
        }
        if (root.right != null){
            right = evaluateTree(root.right);
        }
        // parent Nod evaluate karna
        boolean res = false;
        if (root.val == 2){
            res = (left||right)? true:false;
        } else if (root.val== 3) {
            res = (left && right) ? true:false;
        }
        return res;
    }

    public static void main(String[] args) {
        Evaluate_Boolean_Binary_Tree tree = new Evaluate_Boolean_Binary_Tree();

        Treenode root = new Treenode(2); // OR operator
        root.left = new Treenode(1); // true
        root.right = new Treenode(3); // AND operator
        root.right.left = new Treenode(0); // false
        root.right.right = new Treenode(1); // true

        System.out.println("Result of evaluating the tree: " + tree.evaluateTree(root));
    }
}
