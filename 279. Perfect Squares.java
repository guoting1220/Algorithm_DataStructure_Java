public class Solution {
    public int numSquares(int n) {
        if(n<=1) return 1;
        int[] a = new int[n+1]; //a[0], a[1]--1, a[2]--2, .. a[n]--n
        a[1] = 1;
        int p, q;
        int sq;
        for(int i=2; i<=n; i++){
            a[i] = i;
            sq = (int)Math.sqrt(i);
            if(sq*sq == i) a[i] = 1;
            else{
                for(int k=1; k<=sq; k++){
                    a[i] = Math.min(a[i], a[k*k]+a[i-k*k]);
                }
            }
        }
        return a[n];
    }
}