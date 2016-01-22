public class Solution {
    public int maxSubArray(int[] nums) {
       // if(nums.length==0) return 0;
       int max = nums[0];
       int curMax = nums[0];
       for(int i=1; i<nums.length; i++){
           curMax = Math.max(curMax+nums[i], nums[i]);
           max = Math.max(max, curMax);
       }
       return max;
    }
}