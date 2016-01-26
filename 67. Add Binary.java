public class Solution {
    public String addBinary(String a, String b) {
        if(a==null || a=="") return b;
        if(b==null || b=="") return a;
        int c=0;
        int i = a.length()-1;
        int j = b.length()-1;
        int x, y;
        StringBuffer buffer = new StringBuffer();
        while(i>=0 || j>=0 || c==1){
            x = (i>=0)? a.charAt(i)-'0' : 0; // the way to convert character number to int
            y = (j>=0)? b.charAt(j)-'0' : 0;
            
            if(x+y+c == 3){
                buffer.insert(0,"1");  //add from left, if add from right, use append
                c = 1;
            }
            else if(x+y+c == 2){
                buffer.insert(0,"0");
                c = 1;
            }
            else if(x+y+c == 1){
                buffer.insert(0,"1");
                c = 0;
            }
            else {
                buffer.insert(0,"0");
                c = 0;
            }
            
            i--;
            j--;
        }
        return buffer.toString();
    }
}