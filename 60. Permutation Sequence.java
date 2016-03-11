public class Solution {
    public String getPermutation(int n, int k) {
        if(n==0 || k==0) return "";
        StringBuffer sb = new StringBuffer();
        int numEachGroup = 1;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=1; i<=n; i++) {
            list.add(i);
            numEachGroup *= i;
        }
        int m;
        int c;
        while(list.size()!=0){
            numEachGroup = numEachGroup / n;
            m = (k % numEachGroup == 0)? k/numEachGroup-1 : k/numEachGroup;
            c = (k % numEachGroup == 0)? numEachGroup : k%numEachGroup;
            sb.append(list.get(m));
            list.remove(m);
            n--;
            k = c;
        }
        return sb.toString();
    }
}