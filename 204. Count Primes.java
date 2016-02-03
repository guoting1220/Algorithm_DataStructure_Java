public class Solution {
    public int countPrimes(int n) {
        if(n<=2) return 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int c = 0;
        for(int i=2; i<n; i++){
            if(set.add(i)){
                c++;
                for(int j=i; j<n; j=j+i) set.add(j);
            }
        }
        return c;
    }
}