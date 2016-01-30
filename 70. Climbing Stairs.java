public class Solution {
    public int climbStairs(int n) {
        if(n<=1) return 1;
        if(n==2) return 2;
        int last1 = 2;
        int last2 = 1;
        int result = 2;
        for(int i=3; i<=n; i++){
            result = last1 + last2;
            last2 = last1;
            last1 = result;
        }
        return result;
    }
}