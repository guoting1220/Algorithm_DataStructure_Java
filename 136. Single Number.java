public class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(Integer k : nums){
            if(!set.add(k)) set.remove(k);
        }
        return set.iterator().next();
    }
}