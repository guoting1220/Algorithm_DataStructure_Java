public class Solution {
    public void nextPermutation(int[] nums) {
        
        int firstSmallIndex = -1; 
        
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]) {
                firstSmallIndex = i;
                break;
            }
        }
        
        if(firstSmallIndex == -1){
            Arrays.sort(nums);
            return;
        }
        
        int smallestBiggerIndex = firstSmallIndex + 1;
        for(int i=firstSmallIndex+2; i<nums.length; i++){
            if(nums[i]>nums[firstSmallIndex] && nums[i]<nums[smallestBiggerIndex]) smallestBiggerIndex = i;
        }
        
        int tmp;
        tmp = nums[smallestBiggerIndex];
        nums[smallestBiggerIndex] = nums[firstSmallIndex];
        nums[firstSmallIndex] = tmp;
        
        Arrays.sort(nums, firstSmallIndex + 1, nums.length);  //Arrays.sort(nums, a,b) from index a to b-1  !!
        
        return;
    }
}