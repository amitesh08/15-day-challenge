public class SlidingWindow {
    public static void main(String[] args) {
        //Sliding window
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 2;

        System.out.println(maxWindowSum(arr,k));
    }
    public static int maxWindowSum(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;

        //window sum
        for  (int i = 0; i < k; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;

        //sliding the window
        for (int i = k; i < arr.length ; i++) {
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
