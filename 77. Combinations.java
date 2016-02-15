public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        helper(result, list, n, k, 1);
        return result;
    }
    public void helper(List<List<Integer>> result, List<Integer> list, int n, int k, int index){
        if(k==0){
            result.add(new ArrayList<Integer>(list));
            return; 
        }
        
        for(int i=index; i<=n; i++){
            list.add(i);
            helper(result, list, n, k-1, i+1);
            list.remove(list.size()-1);
        }
    }
}