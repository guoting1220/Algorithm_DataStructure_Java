public class Solution {
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0) return 0;
        int len = citations.length;
        Arrays.sort(citations);
        if(citations[0]>=len) return len;
        for(int i=0; i<len-1; i++){
            if(citations[i]<=len-i-1 && citations[i+1]>=len-i-1) return len-i-1;
        }
        return 0;
    }
}