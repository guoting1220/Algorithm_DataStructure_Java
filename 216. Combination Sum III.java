public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        helper(k, n, result, list, 1);
        return result;
    }
    
    public void helper(int k, int n, List<List<Integer>> result, List<Integer> list, int num){
        if(k==0 && n==0) {
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        if((k==0 && n!=0) || (n==0 && k!=0)) return;
        
        for(int i=num; i<=9; i++){
            if(i > n) return;  //be careful here is i not num
            list.add(i);  //be careful here is i not num
            helper(k-1, n-i, result, list, i+1);   //be careful here is i not num
            list.remove(list.size()-1);
        }
        
        return;
    }
}