
public class PrefixSum {
    public static void main(String[] args) {
        //Prefix Sum
        int[] arr = {3, 6, 2, 8, 1, 4};
        int[] prefix = calPrefix(arr);
        System.out.println("range sum "+rangeSum(prefix,2,5));
    }
    public static int[] calPrefix(int[] arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i< arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        return prefix;
    }
    public static int rangeSum(int[] prefix , int start , int end){
        if(start == 0 ) return prefix[end];
        return prefix[end] - prefix[start - 1];
    }
}