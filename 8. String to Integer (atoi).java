// to deal with the number out of range limit, use double first!!

public class Solution {
    public int myAtoi(String str) {
        if(str==null || str.length()==0) return 0;
      //  str.trim();
        int i=0;
        double result = 0;
        boolean neg = false;
        
        while(i<=str.length()-1 && str.charAt(i)==' ') i++;
        if(i>str.length()-1) return 0;
        
        if(str.charAt(i)=='-') {
            neg = true;
            i++;
        }
        else if(str.charAt(i)=='+'){
            i++;
        }
        
        if(i>str.length()-1) return 0;
        if(str.charAt(i)<'0' || str.charAt(i)>'9') return 0;  // check the first digit after sign
        
        while(i<=str.length()-1){
            if(str.charAt(i)<'0' || str.charAt(i)>'9') break;
            result = result*10 + str.charAt(i)-'0';
            i++;
        }
        
        result = (neg)? -result : result;
        if(result>Integer.MAX_VALUE) result = Integer.MAX_VALUE;
        if(result<Integer.MIN_VALUE) result = Integer.MIN_VALUE;
        
        return (int)result;   //!!! dont forget (int) type convertion!!
    }
}