import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        //example 1
        /*
                // Creating a stack
                Stack<Integer> stack = new Stack<>();

                // Pushing elements onto the stack
                stack.push(10);
                stack.push(20);
                stack.push(30);

                // Printing the stack
                System.out.println("Stack: " + stack);

                // Popping the top element
                int top = stack.pop();
                System.out.println("Popped element: " + top);

                // Peeking the top element
                int peeked = stack.peek();
                System.out.println("Top element: " + peeked);

                // Checking if the stack is empty
                boolean empty = stack.isEmpty();
                System.out.println("Is the stack empty? " + empty);

                // Searching for an element
                int index = stack.search(20);
                System.out.println("Index of 20: " + index);
         */
//------------------------------------------------------------------------------------------------

        //Example 2
        //this class related with stack class
        stack mystack=new stack(3);
        mystack.isFull();
        mystack.push(10);
        mystack.push(20);
        mystack.push(30);

        mystack.isEmpty();
        mystack.pop(10);

            }
        }


