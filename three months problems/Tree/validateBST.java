import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Main {
    static Node treeBuilder(String str){
        if(str.length()==0 || str.charAt(0)=='-'){
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currdata = ip[i];
            if(!currdata.equals("-1")) {
                currNode.left = new Node(Integer.parseInt(currdata));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currdata = ip[i];
            if(!currdata.equals("-1")) {
                currNode.right = new Node(Integer.parseInt(currdata));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root){
        if(root == null)
            return;
        printInorder(root.left);
        System.out.print(root.data+" ");
        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            Node root = treeBuilder(s);
            Solution g = new Solution();
            if(g.isValidBST(root))
                System.out.println("true");
            else
                System.out.println("false");
            t--;
        }
    }

}


class Node {
    int data;
    Node left;
    Node right;
    Node() {}
    Node(int data) { this.data = data; }
    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    public boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE,Long.MAX_VALUE);

    }
    public boolean isValidBST(Node root, long mindata, long maxdata){
        if(root == null) return true;
        if(root.data >= maxdata || root.data <= mindata) return false;
        return isValidBST(root.left,mindata, root.data)&&isValidBST(root.right, root.data, maxdata);
    }
}