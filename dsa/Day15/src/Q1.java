import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();  // Remove last valid score
            } else if (op.equals("D")) {
                stack.push(2 * stack.peek());  // Double the last score
            } else if (op.equals("+")) {
                int last = stack.pop();
                int newTop = last + stack.peek();  // Sum of last two
                stack.push(last);  // Push back the popped value
                stack.push(newTop);
            } else {
                stack.push(Integer.parseInt(op));  // Just a number
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
