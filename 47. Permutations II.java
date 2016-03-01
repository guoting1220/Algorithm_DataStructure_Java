public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        helper(result, list, nums, visited);
        return result;
    }
    
    public void helper(List<List<Integer>> result, List<Integer> list, int[] nums, boolean[] visited){
        if(list.size()==nums.length){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(i!=0 && nums[i]==nums[i-1] && visited[i-1]==false) continue; //!!!!!!!!!!
            if (visited[i]==false){
                list.add(nums[i]);
                visited[i] = true;
                helper(result, list, nums, visited);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
        return;
    }
}