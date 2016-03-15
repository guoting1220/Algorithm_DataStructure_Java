public class Solution {
    public int numDecodings(String s) {
        if(s==null || s.length()==0) return 0;
        int[] a = new int[s.length()+1];
        a[s.length()] = 1;
        a[s.length()-1] = (s.charAt(s.length()-1)=='0')? 0 : 1;
        for(int i=s.length()-2; i>=0; i--){
            if(s.charAt(i)=='0') a[i] = 0;
            else if(Integer.parseInt(s.substring(i, i+2))>26) a[i] = a[i+1];
            else a[i] = a[i+1] + a[i+2];
        }
        return a[0];
    }
}
