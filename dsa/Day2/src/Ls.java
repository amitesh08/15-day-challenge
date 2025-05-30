public class Ls {
    public static void main(String[] args) {
        //
        int[] arr = {1,5,2,3,7,8,9,3};
        System.out.println(search(arr,3));
        System.out.println(frequency(arr,3));
        System.out.println("first and last " +search(arr,3)+ " "+last(arr,3));
        System.out.println(countGreater(arr,2));
        targetExist(arr,4);

    }
//    Implement linear search (return index).
    public static int search(int[] arr, int target){
        for (int i = 0; i<arr.length; i++){
            if (arr[i] == target) return i;
        }
        return -1;
    }
    //Count the frequency of a number.
    public static int frequency(int[] arr, int target){
        int count = 0;
        for (int j : arr) {
            if (j == target) count++;
        }
        return count;
    }
    //Find first and last occurrence of a number.
    public static int last(int[] arr, int target){
        for (int i = arr.length - 1 ; i>=0; i--){
            if (arr[i] == target) return i;
        }
        return -1;
    }
    //Count how many numbers are greater than a given number.
    public static int countGreater(int[] arr , int target){
        int countGreater = 0;
        for (int j : arr) {
            if (j > target) countGreater++;
        }
        return countGreater;
    }
    //Check if a target exists or not using linear search.
    public static void targetExist(int[] arr, int target){
        for (int j : arr) {
            if (j == target) {
                System.out.println("Target Exist");
            }
        }
        System.out.println("Target didn't exist.");
    }
}