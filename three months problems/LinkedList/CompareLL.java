import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class Main {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    class LinkedList {
        Node head;

        void add(int data) {
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // Method to compare two linked lists
    public static int compareLists(Node head1, Node head2) {
        while (head1 != null && head2 != null) {
            if (head1.data != head2.data) { // If data mismatch
                return 0;
            }
            head1 = head1.next;
            head2 = head2.next;
        }

        // If both lists are fully traversed, they are equal
        return (head1 == null && head2 == null) ? 1 : 0;
    }

    public static void main(String args[]) throws IOException {
        Main main = new Main(); // Create an instance to access inner classes
        LinkedList list1 = main.new LinkedList();
        LinkedList list2 = main.new LinkedList();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println("Enter the number of nodes for the first linked list:");
        int n1 = Integer.parseInt(br.readLine());

       // System.out.println("Enter the elements for the first linked list:");
        for (int i = 0; i < n1; i++) {
            list1.add(Integer.parseInt(br.readLine()));
        }

       // System.out.println("Enter the number of nodes for the second linked list:");
        int n2 = Integer.parseInt(br.readLine());

     //   System.out.println("Enter the elements for the second linked list:");
        for (int i = 0; i < n2; i++) {
            list2.add(Integer.parseInt(br.readLine()));
        }

        // Compare the two lists
        int result = compareLists(list1.head, list2.head);

        // Print the result
        System.out.println( result); // 1 if lists are identical, 0 otherwise
    }
}
