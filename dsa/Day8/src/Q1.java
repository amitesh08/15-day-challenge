
public class Q1 {
    public static void main(String[] args) {
        //387. First Unique Character in a String.
        String s = "lleexxz";
        System.out.println(firstUniqueChar(s));
    }
    public static int firstUniqueChar(String s){
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
