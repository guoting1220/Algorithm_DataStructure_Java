public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        result.add(list);
        Arrays.sort(nums); // dont forget!!!
        helper(result, list, nums, 0);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int index){
        int len = nums.length;
    //    if(index==len) return;
        for(int i=index; i<len; i++){
            list.add(nums[i]);
            result.add(new ArrayList<Integer>(list));
            helper(result, list, nums, i+1); // be careful. here is i+1 not index+1
            list.remove(list.size()-1);
        }
    }
}