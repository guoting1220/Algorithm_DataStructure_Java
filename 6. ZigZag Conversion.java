public class Solution {
    public String convert(String s, int numRows) {
        if(s==null || s.length()==0 || numRows<=1) return s;
        int len = s.length();
        //if(numRows>=len) return s;
        int col = len/(numRows*2-2) + 1;
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<numRows; i++){
            for(int j=0; j<col; j++){
                if(((numRows*2-2)*j+i)<len) sb.append(s.charAt((numRows*2-2)*j+i));
                if(i!=0 && i!=numRows-1 && (numRows*2-2)*j+numRows-2+numRows-i<len) 
                    sb.append(s.charAt((numRows*2-2)*j+numRows-2+numRows-i));
            }
        }
        return sb.toString();
    }
}