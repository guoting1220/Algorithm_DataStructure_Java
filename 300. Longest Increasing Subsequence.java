public class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length<=1) return nums.length;
        int[] c = new int[nums.length]; //the max length of increasing sequence ended with current position
        //for(int k : c) k = 1;  // why not work?
        c[0] = 1;
        int max;
        int result = 1;
        for(int i=1; i<nums.length; i++){
            c[i] = 1;  //initialize
            max = 0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    max = Math.max(max, c[j]);
                }
            }
            if(max>0) c[i] = max + 1; // if max==0, all elements in front of it are bigger than it
            result = Math.max(result, c[i]);
        }
        return result;
    }
}