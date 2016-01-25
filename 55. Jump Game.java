public class Solution {
    public boolean canJump(int[] nums) {
        int farIndex = 0;
	    for (int i = 0; i < nums.length; i++) {
	       if (i>farIndex)  return false;
	       if(farIndex>=nums.length-1) return true;
	       farIndex = Math.max(farIndex, nums[i] + i);
	   }
	   return false;
    }
}