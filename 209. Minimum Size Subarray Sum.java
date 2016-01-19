public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        //2 pointers!
        int i=0, j=0, sum=0, min=Integer.MAX_VALUE;
        while(j<nums.length){
            sum += nums[j++];
            while(sum>=s){
                min = Math.min(min, j-i);
                sum -= nums[i];
                i++;
            }
        }
        return min==Integer.MAX_VALUE? 0 : min;
    }
}