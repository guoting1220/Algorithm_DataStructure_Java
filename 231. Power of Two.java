public class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n>1){
            if((n&1)==1) return false; //!!! need () inclide the n&1
            n = n>>1;
        }
        return true;
    }
}