// quick sort
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return helper(nums, k, 0, nums.length-1);
    }
    
    public int helper(int[] nums, int k, int start, int end){
        int pivot = nums[start];
        int i = start+1;
        int j = end;
        int tmp;
        while(i<=j){
            if(nums[i]>=pivot) i++;
            else{
                tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j--;
            }
        }
        nums[start] = nums[j];
        nums[j] = pivot; // j is the position of the pivot
        
        if(j+1==k) return pivot;
        else if(j+1<k) return helper(nums, k, j+1, end);  //here is: k, not k-j-1 !!!
        else return helper(nums, k, start, j-1);
    }
}



