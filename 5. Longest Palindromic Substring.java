public class Solution {
    public String longestPalindrome(String s) {
        if(s==null && s.length()==1) return s;
        String s1;
        String s2;
        String result = s.substring(0,1); // must!
        String longer = "";
        for(int i=0; i<s.length()-1; i++){
            s1 = helper(s, i, i);
            s2 = helper(s, i, i+1);
            longer = (s1.length()>s2.length())? s1 : s2;
            result = (result.length()>longer.length())? result : longer;
        }
        return result;
    }
    
    public String helper(String s, int start, int end){
        while(start>=0 && end<=s.length()-1 && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
        }
        return s.substring(start+1, end);
    }
}