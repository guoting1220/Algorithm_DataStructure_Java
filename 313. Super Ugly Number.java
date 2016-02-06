public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n+1];
        ugly[1] = 1;
        int[] idx = new int[primes.length];
        for(int i=0; i<primes.length; i++) idx[i] = 1;
        
        for(int i=2; i<=n; i++){
            ugly[i] = Integer.MAX_VALUE;
            for(int j=0; j<primes.length; j++){
                ugly[i] = Math.min(ugly[idx[j]] * primes[j], ugly[i]);
            }
            for(int j=0; j<primes.length; j++){
                if(ugly[i]==ugly[idx[j]] * primes[j]) idx[j]++;
            }
        }
        return ugly[n];
    }
}