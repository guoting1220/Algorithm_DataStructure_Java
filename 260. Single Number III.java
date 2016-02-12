public class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer k : nums){
            if(!set.add(k)) set.remove(k);
        }
        int[] result = new int[2];
        Iterator it = set.iterator();
        for(int i=0; i<2; i++){
            result[i] = (int)it.next();
        }
        return result;
    }
}