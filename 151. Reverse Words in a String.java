public class Solution {
    public String reverseWords(String s) {
        StringBuffer buffer = new StringBuffer();
        String[] a = s.split(" ");
        for(int i=a.length-1; i>=0; i--){
            if(!a[i].equals("")){  //if s="a   b" a[]=["a", "", "", "b"], "" not " "!!!
                buffer.append(a[i]);
                buffer.append(" ");
            }
        }
        return buffer.toString().trim();
    }
}