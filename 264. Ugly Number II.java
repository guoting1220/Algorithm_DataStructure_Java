public class Solution {
    public int nthUglyNumber(int n) {
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        int m2 = 1;
        int m3 = 1;
        int m5 = 1;
        for(int i=2; i<=n; i++){
            a[i] = Math.min(a[m2]*2, Math.min(a[m3]*3, a[m5]*5));
            if(a[i]==a[m2]*2) m2++;
            if(a[i]==a[m3]*3) m3++;
            if(a[i]==a[m5]*5) m5++;
        }
        return a[n];
    }
}