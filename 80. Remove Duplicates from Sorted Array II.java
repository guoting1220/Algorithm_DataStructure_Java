public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2) return nums.length;
        int index = 1;
        int c = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1] && c==0) {
                nums[index] = nums[i];
                c++;
                index++;
            }
            else if(nums[i]!=nums[i-1]){
                nums[index] = nums[i];
                index++;
                c = 0;
            }
        }
        return index;
    }
}