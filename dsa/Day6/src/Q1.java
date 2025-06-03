import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        //344. Reverse String
        char[] s = {'h', 'e','l', 'l', 'o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            right--;
            left++;
        }
        System.out.println(Arrays.toString(s));
    }
}
