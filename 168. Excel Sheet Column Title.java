//decimal: 0 1 2 ... 9 |  10 11    
//this problem: 0 1 ... 25 | 26 scale 

public class Solution {
    public String convertToTitle(int n) {
        if(n<=0) return "";
        StringBuffer sb = new StringBuffer();
        while(n>0){
            n--;
            sb.insert(0, (char)(n%26 + 'A'));
            n = n / 26;
        }
        return sb.toString();
    }
}