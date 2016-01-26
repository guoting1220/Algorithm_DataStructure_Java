public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int mid;
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid]<nums[mid+1]) start = mid+1;
            else end = mid;
        }
        return start;
    }
}