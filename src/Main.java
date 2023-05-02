
public class Main {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);

        Solution tt = new Solution();
        System.out.println(tt.inorderTraversal(tree));
        System.out.println(tt.inorderTraversalIterative(tree));
    }

}