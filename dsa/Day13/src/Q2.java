
public class Q2 {
    public static void main(String[] args) {
        String num = "5234564";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--){
            if (isOdd(num.charAt(i))) return num.substring(0, i+1);
        }
        return "";
    }
    public static boolean isOdd(char i){
        int digit = i - '0'; // convert char to int
        return (digit % 2 != 0);
    }
}
