import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Stack -

        //creating a stack
        Stack<Integer> s = new Stack<>();

        //push elements in the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s);

        //to get the top element of the stack
        System.out.println("peeking the stack is: " +s.peek());

        //to search the element in the stack
        int pos = s.search(4);
        if (pos == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("element is at pos "+pos);
        }
        //pop the element
        while(!s.empty()){
            System.out.println(s.pop());
        }
    }
}