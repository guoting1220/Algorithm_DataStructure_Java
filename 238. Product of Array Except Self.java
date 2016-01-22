public class Solution {
    public int[] productExceptSelf(int[] nums) {
       // if(nums.length==0) return [];
        int p = nums[0];
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i=1; i<nums.length; i++){ //production from left
            result[i] = p;
            p = p * nums[i];
        }
        p = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){ //production from right
            result[i] *= p;
            p = p*nums[i];
        }
        return result;
    }
}