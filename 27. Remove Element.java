public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length<1) return 0;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if(nums[i]==val){
                nums[i] = nums[j];
                j--;
            }
            else i++;
        }
        return j+1;
    }
}