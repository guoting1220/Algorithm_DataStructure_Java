public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> each = new ArrayList<Integer>();
        if(nums==null || nums.length<=2) return result;
        int start;
        int end;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if(i==0||nums[i]!=nums[i-1]){
                start = i+1;
                end = nums.length-1;
                while(start<end){
                    if(nums[start]+nums[end]==-nums[i]){  //avoid duplicate
                        each.add(nums[i]);
                        each.add(nums[start]);
                        each.add(nums[end]);
                        result.add(each);
                        each = new ArrayList<Integer>();
                        while(start<end && nums[start]==nums[start+1]) start++; //avoid duplicate
                        while(start<end && nums[end]==nums[end-1]) end--; 
                        start++;
                        end--;
                    }
                    else if(nums[start]+nums[end]<-nums[i]) start++;
                    else end--;
                }
            }
        }
        return result;
    }
}