import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        String s = "([])";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                // If it's an opening bracket, push it
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                }
                // If it's a closing bracket, check for match
                else {
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();

                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '[')) {
                        return false;
                    }
                }
            }
            // If stack is empty, all brackets matched
            return stack.isEmpty();
    }
}
