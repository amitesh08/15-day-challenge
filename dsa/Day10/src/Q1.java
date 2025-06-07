import java.util.HashMap;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        //290. Word Pattern
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern,s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(words.length != pattern.length()) return false;

        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        for(int i =0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                // Mismatch with existing mapping
                if (!map.get(ch).equals(word)) return false;
            } else {
                // If this word is already mapped to some other char
                if (usedWords.contains(word)) return false;

                map.put(ch, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}
