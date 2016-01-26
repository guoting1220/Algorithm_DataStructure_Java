public class Solution {
    public String countAndSay(int n) {
        if(n==0) return "";
        String s = "1";
        int c = 1;
        if(n==1) return "1";
        StringBuffer buffer = new StringBuffer("1");
        for(int k=2; k<=n; k++){
            s = buffer.toString();
            buffer = new StringBuffer();
            c = 1;
            for(int i=1; i<=s.length()-1; i++){
                if(s.charAt(i)==s.charAt(i-1)) c++;
                else{
                    buffer.append(c);
                    buffer.append(s.charAt(i-1));
                    c = 1;
                }
            }
            buffer.append(c);
            buffer.append(s.charAt(s.length()-1));
           
        }
        return buffer.toString();
    }
}