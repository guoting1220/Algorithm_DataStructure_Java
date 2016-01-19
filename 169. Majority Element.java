public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1) return nums[0];
        int result = nums[0];
        int c = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==result) c++;
            else if(nums[i]!=result && c!=0) c--;
            else {
                result = nums[i];
                c = 1;
            }
        }
        return result; //assume majority exists always
   }
}