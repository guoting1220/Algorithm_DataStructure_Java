public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int start, end, diff;
        int diffMin = Integer.MAX_VALUE;
        int result = 0; // doesn't matter what the initialized value is
        int curSum;
        Arrays.sort(nums);  //!!!!!!!
        for(int i=0; i<nums.length-2; i++){
            start = i+1;
            end = nums.length-1;
            while(start<end){
                curSum = nums[i] + nums[start] + nums[end];
                diff = Math.abs(curSum-target);
                if(diff<diffMin){
                    diffMin = diff;
                    result = curSum;
                }
                if(curSum==target) return target;
                else if(curSum<target) start++;
                else end--;
            }
        }
        return result;
    }
}