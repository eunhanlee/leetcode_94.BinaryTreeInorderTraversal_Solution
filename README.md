# 94. Binary Tree Inorder Traversal Problem Solved: Uncover the Most Efficient Java Algorithm!

# Problem

[Problem_Link](https://leetcode.com/problems/binary-tree-inorder-traversal/description/)

## **Problem Solving Approach**

- To traverse a binary tree in in-order, we use depth-first search (DFS).
- The problem also requires us to solve it using a simple loop, so it tests our ability to convert between while loops and recursive calls.

# Time **O(n), Space O(n)**

```java
import java.util.*;

class Solution {

    /**
     * Traverses a binary tree in-order recursively and returns a list of node values.
     *
     * @param root the root node of the binary tree to traverse
     * @return a list of node values in in-order traversal order
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        // Call the recursive function to traverse the tree in-order
        inorderRecur(root, list);
        // Return the resulting list
        return list;
    }

    /**
     * Helper method that recursively traverses a binary tree in-order and adds node values to a list.
     *
     * @param root the root node of the binary tree to traverse
     * @param list the list to add node values to
     */
    public static void inorderRecur(TreeNode root, List<Integer> list) {
        // Base case: if the node is null, return immediately
        if (root == null) return;

        // Traverse the left subtree recursively
        inorderRecur(root.left, list);

        // Add the current node value to the list
        list.add(root.val);

        // Traverse the right subtree recursively
        inorderRecur(root.right, list);
    }

    /**
     * Traverses a binary tree in-order iteratively and returns a list of node values.
     *
     * @param root the root node of the binary tree to traverse
     * @return a list of node values in in-order traversal order
     */
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            // Add nodes in the left subtree to the stack
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            // Pop a node from the stack, set it as the current node, and add its value to the list
            node = stack.pop();
            list.add(node.val);

            // Move to the right subtree
            node = node.right;
        }

        return list;
    }
}
```
