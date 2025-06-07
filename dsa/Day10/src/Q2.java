import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q2 {
    public static void main(String[] args) {
//        349. Intersection of Two Arrays
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return new int[0];

        // Optional optimization: loop on smaller array
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Set<Integer> hs = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for(int num : nums1) hs.add(num);

        for(int num : nums2){
            if(hs.contains(num)){
                common.add(num);
            }
        }
        int[] arr = new int[common.size()];
        int i = 0;
        for (int num : common) {
            arr[i++] = num;
        }
        return arr;
    }
}
