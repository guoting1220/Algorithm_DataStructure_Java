public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits==null || digits.length==0) return digits;
        int i = digits.length-1;
        while(i>=0){
            if(digits[i]!=9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
            i--;
        }
        int result[] = new int[digits.length+1];
        result[0] = 1;
        for(int j=1; j<digits.length+1; j++) result[j] = 0;
        return result;
    }
}