public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length()<=1) return true;
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<=s.length()-1 && !isAlfa(s.charAt(i)) && i<=j) i++;
            while(j>=0 && !isAlfa(s.charAt(j)) && j>=i) j--;
            if(i>=j) return true;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false; // !! remember this method to compare two characters regardless of case
            i++;
            j--;
        }
        return true;
    }
    
    public boolean isAlfa(char c){
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')) return true; //!! '0'not 0, character not number!!!
        else return false;
    }
}