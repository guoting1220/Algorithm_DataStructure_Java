public class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        int curMax = nums[0];
        int curMin = nums[0];
        int tmp = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            tmp = curMax;  // !!!!
            curMax = Math.max(Math.max(curMax*nums[i], curMin*nums[i]), nums[i]);
            curMin = Math.min(Math.min(tmp*nums[i], curMin*nums[i]), nums[i]);
            max = Math.max(max, curMax);
        }
        return max;
    }
}