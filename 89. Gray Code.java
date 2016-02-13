public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0); 
        int len;
        for(int i=1; i<=n; i++){
            len = result.size();
            for(int j=len-1; j>=0; j--){
                result.add(result.get(j) + (int)Math.pow(2,i-1));
            }
        }
        return result;
    }
}