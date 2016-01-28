public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;
        int start = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(s.charAt(0), 0);
        int maxLen = 1;
        for(int i=1; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))) start = Math.max(start, map.get(s.charAt(i))+1);
            
            maxLen = Math.max(maxLen, i-start+1);
            map.put(s.charAt(i), i);
        }
        return maxLen;
    }
}