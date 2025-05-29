import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
//Given an integer array nums of length n, return an array of length 2n where ans[i] = nums[i % n].
//✅ Input: [1, 2, 1]
//✅ Output: [1, 2, 1, 1, 2, 1]

        int [] arr = {1,2,3};
        concat(arr);
    }
    public static void concat(int[] arr){
        int [] newArr = new int[arr.length * 2];
        for(int i = 0; i < arr.length; i++){
           newArr[i] = arr[i];
           newArr[arr.length + i] = arr[i];
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Concatenated Array: " + Arrays.toString(newArr));
    }

}
