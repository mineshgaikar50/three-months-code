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
    List<Integer> preorderTraverse(TreeNode root,List<Integer> list) {

        if(root==null)
            return list;
        list.add(root.val);
        preorderTraverse(root.left,list);
        preorderTraverse(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        list = preorderTraverse(root,list);
        return list;
    }
}

class Main{
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Creating an instance of Solution
        Solution solution = new Solution();

        // Performing preorder traversal
        List<Integer> result = solution.preorderTraversal(root);

        // Printing the result
        System.out.println("Preorder Traversal: " + result);

    }
}