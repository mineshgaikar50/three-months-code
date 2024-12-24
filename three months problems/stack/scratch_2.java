import java.util.Scanner;
import java.util.Stack;

class Solution {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    // Constructor to initialize the stacks
    public Solution() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    // Push an element into the stack
    public void push(int x) {
        stack.push(x);

        // Update the minStack only if it's empty or x is <= the current minimum
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    // Pop the top element from the stack and return it
    public int pop() {
        if (stack.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        int poppedElement = stack.pop();

        // If the popped element is the current minimum, pop it from minStack too
        if (poppedElement == minStack.peek()) {
            minStack.pop();
        }
        return poppedElement;
    }

    // Get the minimum element in the stack
    public int getMin() {
        if (minStack.isEmpty()) {
            return -1; // Return -1 if the stack is empty
        }
        return minStack.peek();
    }
}

// Driver code to demonstrate the functionality
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            int q = sc.nextInt();
            Solution g = new Solution();
            while(q>0)
            {
                int qt = sc.nextInt();

                if(qt == 1)
                {
                    int att = sc.nextInt();
                    g.push(att);
                }
                else if(qt == 2)
                {
                    System.out.print(g.pop()+" ");
                }
                else if(qt == 3)
                {
                    System.out.print(g.getMin()+" ");
                }

                q--;
            }
            System.out.println();
            T--;
        }
        sc.close();

    }
}
