import java.util.HashMap;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        // 205. Isomorphic Strings
        String s = "egg";
        String t = "aad";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> usedT = new HashSet<>();

        for (int i = 0; i < t.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (map.containsKey(ch1)) {
                // Mismatch with existing mapping
                if (!map.get(ch1).equals(ch2)) return false;
            } else {
                // If this word is already mapped to some other char
                if (usedT.contains(ch2)) return false;

                map.put(ch1, ch2);
                usedT.add(ch2);
            }
        }
        return true;
    }
}
