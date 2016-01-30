public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();
        helper(result, sb, n, n);
        return result;
    }
    
    public void helper(List<String> result, StringBuffer sb, int left, int right){
        if(left==0 && right==0) {
            result.add(sb.toString());
            return;
        }
        
        if(left>right || left<0 || right<0) return;
       
        sb.append("(");
        helper(result, sb, left-1, right);
        sb.deleteCharAt(sb.length()-1);
            
        sb.append(")");
        helper(result, sb, left, right-1);
        sb.deleteCharAt(sb.length()-1);
    }
}