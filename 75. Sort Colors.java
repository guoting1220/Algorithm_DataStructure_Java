public class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int start = 0;
        int end = nums.length-1;
        int i = 0;
        while(i<=end){
            if(nums[i]==0){
                swap(nums, start, i);
                start++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums, end, i);
                end--;
            }
            else i++;
        }
        return;
    }
    
    public void swap(int[] nums, int index1, int index2){
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
        return;
    }
}