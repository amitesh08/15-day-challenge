public class Q2 {
    public static void main(String[] args) {
        //
        String s = "(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (depth > 0) {
                    result.append(ch); // Add opening parenthesis to result if depth > 0
                }
                depth++;
            } else if (ch == ')') {
                depth--;
                if (depth > 0) {
                    result.append(ch); // Add closing parenthesis to result if depth > 0
                }
            }
        }

        return result.toString();
    }
}
