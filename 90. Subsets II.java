public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        if(nums == null || nums.length ==0) return result;
        Arrays.sort(nums);
        helper(result, list, nums, 0);

        return result;
    }
    
    private void helper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
        result.add(new ArrayList<Integer>(list));
        for (int i = pos; i < nums.length; i++) {
            if ( i != pos && nums[i] == nums[i - 1]) {
                continue;
            }    
            list.add(nums[i]);
            helper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}