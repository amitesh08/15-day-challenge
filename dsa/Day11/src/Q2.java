import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String[] args) {
//        560. SubArray Sum Equals K
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subArraySum(nums, k));

    }
    public static int subArraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // base case: sum = 0 has occurred once

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            // If (sum - k) exists in map, it means there is a sub array ending here which sums to k
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }

            // Update map with current prefix sum
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
