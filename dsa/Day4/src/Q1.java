public class Q1 {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(validPalindrome(clean));
    }
    public static boolean validPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
