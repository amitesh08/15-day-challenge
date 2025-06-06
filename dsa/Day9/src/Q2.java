public class Q2 {
    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0; int j = chars.length-1;

        while(i <= j){
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                // Swap vowels
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!isVowel(chars[i])) {
                i++;
            } else if (!isVowel(chars[j])) {
                j--;
            }
        }
        return new String(chars);
    }
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch); // Converts A to a, E to e, etc.
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
