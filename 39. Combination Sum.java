public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         Arrays.sort(candidates);
         List<List<Integer>> result = new ArrayList<List<Integer>>();
         List<Integer> list = new ArrayList<Integer>();
         helper(candidates, target, 0, list, result);
         return result;
    }
    public void helper(int[] arr, int target, int start, List<Integer> list, List<List<Integer>> result) {
         if (target == 0) {
            result.add(new ArrayList<Integer>(list));
            return;
         }
         for (int i = start; i < arr.length; i++) {
            if (arr[i] > target) return; 
            list.add(arr[i]);
            helper(arr, target - arr[i], i, list, result); //start永远不会越界，所以一开始不用check
            list.remove(list.size()-1);
         }
    }
}