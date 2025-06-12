import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
//        1047. Remove All Adjacent Duplicates In String
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If the stack isn't empty and top matches current character, pop
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();  //pop
            } else {
                stack.push(ch); // Otherwise push
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
