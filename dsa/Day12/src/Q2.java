public class Q2 {
    public static void main(String[] args) {
    //796. Rotate String
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(reverseString(s,goal));
    }
    public static boolean reverseString(String s,String goal){
        if(s.length() != goal.length()) return false;

        String str = s + s;
//        int start = 1;
//        int end = goal.length();

// Loop to get all substrings of length (end - start)
//        for (int i = 0; i <= str.length() - (end - start); i++) {
//            String sub = str.substring(i + start - 1, i + end - 1);
//
//            // Check if this is the "one"
//            if (sub.equals(goal)) {
//                return true;
//            }
//        }
//        return false;
        return str.contains(goal);
    }
}
