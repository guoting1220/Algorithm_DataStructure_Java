public class Solution {
    public int hIndex(int[] citations) {
        if(citations==null || citations.length==0) return 0;
        int len = citations.length;
        //Arrays.sort(citations);
        if(citations[0]>=len) return len;
     //   if(citations[len-1]==0) return 0;
        int start = 0;
        int end = len-1;
        int mid;
        while(start<end){
            mid = start + (end-start)/2;
            if(citations[mid]==len-mid) return len-mid;
            else if(citations[mid]>len-mid) end = mid;
            else start = mid +1;
        }
        return (citations[end]>=len-end)? len-end : len-end-1;
    }
}