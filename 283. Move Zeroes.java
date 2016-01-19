public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==0) return;
        int index = 0;
        int i = 0;
        while(i<=nums.length-1){
            if(nums[i]==0) i++;
            else {
                nums[index] = nums[i];
                index++;
                i++;
            }
        }
        while(index<=nums.length-1) {
            nums[index] = 0;
            index++;
        }
        
        return; 
    }
}