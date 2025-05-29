import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        arrOutput(arr,sc);
        average(arr);
        max_min(arr);

    }
    //Create an array of 5 elements, take input from user, print all values.
    public static void arrOutput(int[] arr, Scanner sc){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
    //Find sum and average of array elements.
    public static void average(int[] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        float avg = sum / arr.length;
        System.out.println("Average is " +avg);
    }
    //Find the maximum and minimum elements in the array.
    public static void max_min(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>max) max = arr[i];
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("max is "+max+" and min is "+min);
    }
}