public class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0) return 0;
        String ss = s.trim();  
      //  if(ss.length()==0) return 0;
        if(ss.lastIndexOf(" ")==-1) return ss.length();
        return ss.length()-1-ss.lastIndexOf(" ");
    }
}