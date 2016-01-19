public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> each = new ArrayList<Integer>();
        if(numRows==0) return result;
        each.add(1);
        result.add(each);
        for(int i=1; i<numRows; i++){
            each = new ArrayList<Integer>();
            each.add(1);
            for(int j=0; j<result.get(i-1).size()-1; j++){
                each.add(result.get(i-1).get(j) + result.get(i-1).get(j+1));
            }
            each.add(1);
            result.add(each);
        }
        return result;
    }
}