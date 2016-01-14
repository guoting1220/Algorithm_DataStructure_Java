public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(len<=1 || k==0) return;
        k = k%(len);
        reverse(nums, 0, len-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, len-1);
        return;
    }
    public void reverse(int[] nums, int start, int end){
        if(nums.length<=1 || end-start<1) return;
        int tmp;
        while(end-start>=1){
            tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
        return;
    }
}