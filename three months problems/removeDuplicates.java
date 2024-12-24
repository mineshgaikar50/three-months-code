import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        LinkedList a = new LinkedList();

        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }

        Solution obj = new Solution();
//        System.out.println( obj.deleteDuplicates(a));


    }
}
class Solution {
    public Node deleteDuplicates(Node head) {

       Node res = head;

        while (head!=null && head.next!=null){
            if(head.data == head.next.data){
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }

        }
        return res;

    }
}