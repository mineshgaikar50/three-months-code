import java.util.Scanner;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LinkedList{
    ListNode head;
    void add(int data){
        ListNode new_node = new ListNode(data);
        if(head == null){
            head = new_node;
            return;
        }
        ListNode curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
class Scratch {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int k = input.nextInt();

        LinkedList a = new LinkedList();
//        LinkedList b = new LinkedList();
        for(int i = 0; i < k; i++){
            a.add(input.nextInt());
        }
        int n = input.nextInt();
    }
}
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;

        for(int i = 1; i <= n; ++i)
            fast = fast.next;

        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return start.next;
    }
}