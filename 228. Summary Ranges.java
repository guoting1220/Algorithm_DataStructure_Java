public class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<String>();
        int start = 0;
        int end = 1;
        int len = nums.length;
        if(len==0) return result;
        while(end<=len-1){
            if(nums[end] == nums[end-1]+1) end++;
            else{
                if(end == start + 1) result.add(nums[start]+"");
                else result.add(nums[start] + "->" + nums[end-1]);
                
                start = end;
                end = start + 1;
            }
        }
        if(start == len-1)  result.add(nums[start]+"");
        else result.add(nums[start] + "->" + nums[len-1]);
        
        return result;
    }
}