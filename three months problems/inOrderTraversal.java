import java.util.ArrayList;
import java.util.List;


 class TreeNode {
   int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // Initialize an empty list to store the inorder traversal result
        List<Integer> result = new ArrayList<>();

        // Continue the process until all nodes are visited
        while (root != null) {
            // If there is no left child, visit the current node and go to the right child
            if (root.left == null) {
                result.add(root.val);
                root = root.right;
            } else {
                // Find the inorder predecessor of the current node
                TreeNode predecessor = root.left;
                // Move to the rightmost node of the left subtree or
                // the right child of the predecessor if it's already set
                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }
                // If the right child of the predecessor is not set,
                // this means this is our first time visit this node, thus,
                // set the right child to the current node and move to the left child
                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {
                    // If the right child is already set to the current node,
                    // it means we are visiting the node the second time.
                    // Thus, we should visit the current node and remove the link.
                    result.add(root.val);
                    predecessor.right = null;
                    root = root.right;
                }
            }
        }
        // Return the completed list of nodes in inorder
        return result;
    }
}