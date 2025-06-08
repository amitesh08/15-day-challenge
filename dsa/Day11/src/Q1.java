public class Q1 {
    public static void main(String[] args) {
//    383. Ransom Note
        String ransomNote = "a";
        String magazine = "a";
        System.out.println(canConstruct(ransomNote,magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Store frequencies of letters in magazine
        int[] freq = new int[26]; // 26 lowercase letters

        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            if (freq[ch - 'a'] == 0) {
                return false; // Not enough of this letter
            }
            freq[ch - 'a']--; // Use one letter
        }

        return true;
    }
}
