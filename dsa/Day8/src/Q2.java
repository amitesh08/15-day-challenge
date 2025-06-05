import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
      //String Duplicates Removal
        String s = "geEksforGEeks";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s) {
        Set<Character> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!hs.contains(ch)){
                hs.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
