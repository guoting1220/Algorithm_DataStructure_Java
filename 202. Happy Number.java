public class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int newN = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int d;
        set.add(n);
        while(true){
            newN = 0;    
            while(n>=10){
                d = n%10;
                n = n/10;
                newN += d*d;
            }
            newN += n*n;
            if(newN==1) return true;
            if(!set.add(newN)) return false;
            n = newN;
        }
        
    }
}