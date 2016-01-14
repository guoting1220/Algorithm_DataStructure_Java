public class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len-1]!=9){
            digits[len-1] += 1;
            return digits;
        }
        digits[len-1] = 0;
        for(int i=len-2; i>=0; i--){
            if(digits[i]!=9){
                digits[i] += 1;
                return digits;
            }
            else digits[i] = 0;
        }
        int result[] = new int[len+1];
        result[0] = 1;
        for(int i=1; i<len+1; i++) result[i] = 0;
        return result;
    }
}