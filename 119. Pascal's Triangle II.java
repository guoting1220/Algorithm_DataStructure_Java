public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> each = new ArrayList<Integer>();
        each.add(1);
        if(rowIndex==0) return each;
        List<Integer> eachCopy = each;
        for(int i=0; i<rowIndex; i++){
            eachCopy = each;
            each = new ArrayList<Integer>();
            each.add(1);
            for(int j=1; j<eachCopy.size(); j++){
                each.add(eachCopy.get(j)+eachCopy.get(j-1));
            }
            each.add(1);
        }
        return each;
    }
}