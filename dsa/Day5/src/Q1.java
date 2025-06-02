public class Q1 {
    public static void main(String[] args) {
        //643. Maximum Average Sub array I
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(maxAverage(arr,k));
    }
    public static double maxAverage(int[] arr, int k){
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        double maxAvg = (double) windowSum / k;

        for (int i = k; i < arr.length; i++){
            windowSum += arr[i] - arr[i - k];
            maxAvg = Math.max(maxAvg,(double) windowSum/k);
        }
        return maxAvg;
    }
}
