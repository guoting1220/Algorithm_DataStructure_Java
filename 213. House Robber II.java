public class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        return Math.max(helper(nums, 0, nums.length-2), helper(nums, 1, nums.length-1));
    }
    
    public int helper(int[] nums, int start, int end){
        if(start==end) return nums[end];
        int pre2 = nums[start];
        int pre = Math.max(nums[start+1], nums[start]);
        int max = Math.max(pre2, pre);
        for(int i=start+2; i<=end; i++){
            max = Math.max(nums[i]+pre2, pre);
            pre2 = pre;
            pre = max;
        }
        return max;
    }
}

