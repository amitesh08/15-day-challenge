
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //hashset
        Set<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        String s = "helloo";

        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}