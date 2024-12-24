import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
class Solution{


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) return null;

        if(root1 == null) return root2;

        if(root2 == null) return root1;

        TreeNode output = new TreeNode(root1.val+root2.val);
        output.left= mergeTrees(root1.left,root2.left);
        output.right= mergeTrees(root1.right,root2.right);
        inorderTraversal(output);

        return output;
    }
    public TreeNode findClosestElement(TreeNode root, int value){
        if(root == null) return null;

        int minDiff = Integer.MAX_VALUE;
        TreeNode closeNode = null;
        while (root!=null){
            int currDiff = Math.abs(root.val- value);

            if(currDiff < minDiff){
                minDiff = currDiff;
                closeNode = root;
            }
            if(value< root.val) root =root.left;
            else if (value> root.val) {
                root = root.right;
            }
            else break;
        }
        return closeNode;
    }


    // Utility method for inorder traversal (to verify the tree)
    public  void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}

class Main{
    public static TreeNode buildTree(String input) {
        if (input == null || input.isEmpty() || input.equals("N")) {
            return null;
        }

        // Split the input into values
        String[] values = input.split(" ");

        // Create the root node
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        // Use a queue for level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode currentNode = queue.poll();

            // Check for the left child
            if (!values[i].equals("N")) {
                currentNode.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(currentNode.left);
            }
            i++;

            // Check for the right child
            if (i < values.length && !values[i].equals("N")) {
                currentNode.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(currentNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Tree 1
//        System.out.println("Enter the level-order traversal of Tree 1 (use 'N' for null nodes):");
        String input1 = scanner.nextLine();
        TreeNode root1 = buildTree(input1);

        // Input for Tree 2
//        System.out.println("Enter the level-order traversal of Tree 2 (use 'N' for null nodes):");
//        String input2 = scanner.nextLine();
//        TreeNode root2 = buildTree(input2);
        int key = scanner.nextInt();

        Solution obj = new Solution();
        System.out.println(obj.findClosestElement(root1, key));

//


    }
}