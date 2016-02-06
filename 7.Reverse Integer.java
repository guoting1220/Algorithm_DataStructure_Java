public class Solution {
    public int reverse(int x) {
       // if(x>-10 && x<10) return x;
        boolean neg = (x<0)? true : false;
        x = Math.abs(x);
        double result = 0;
        int c;
        while(x>0){
            c = x%10;
            x = x/10;
            result = result*10 + c;
        }
        result =  (neg)? -result : result;
        if(result>Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
        return (int)result;
    }
}
