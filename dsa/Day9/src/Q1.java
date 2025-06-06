public class Q1 {
    public static void main(String[] args) {
        //392. Is Subsequence.
        String s = "acd";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        int i =0; int j =0;

        while (i < s.length() && j < t.length()){ //runs if either is true.
            //moving both if i == j , if not only j.
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
