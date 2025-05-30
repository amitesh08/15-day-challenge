import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        System.out.println((disappeared(arr,n)));
    }
    public static ArrayList<Integer> disappeared(int[] arr, int n){
        int[] newArr = new int[n+1];
        for (int i = 0; i< n; i++){
            newArr[arr[i]]++;
        }
        ArrayList<Integer> li = new ArrayList<Integer>();
        for (int i = 1; i< newArr.length; i++){
            if(newArr[i] == 0) li.add(i);
        }
        return li;
    }
}
