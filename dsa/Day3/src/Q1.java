public class Q1 {
    public static void main(String[] args) {
        //724. Find Pivot Index
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums){
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}

//------------- Alternate ----------------
//if(nums.length == 0) return - 1;
//        int leftSum = 0, rightSum = 0;
//      for(int num : nums)
//rightSum += num;
//
//      for(int i = 0; i < nums.length; i ++) {
//rightSum -= nums[i];
//        if(rightSum == leftSum) return i;
//leftSum += nums[i];
//        }
//        return - 1;
