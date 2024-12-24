import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;


 // Definition for a binary tree node.
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;this.right = right;
     }
  }

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();


        while (root != null) {

            if (root.left == null) {
                result.add(root.val);
                root = root.right;
            } else {

                TreeNode predecessor = root.left;

                while (predecessor.right != null && predecessor.right != root) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    predecessor.right = root;
                    root = root.left;
                } else {

                    result.add(root.val);
                    predecessor.right = null;
                    root = root.right;
                }
            }
        }

        return result;
    }
}

class TreeNodeImpl extends TreeNode {
}