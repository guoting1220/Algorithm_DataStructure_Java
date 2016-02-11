
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;  
        int mid;
        while(start<end){
              mid = start + (end-start) / 2;  // here not use (start+end)/2, (start+end)/2 may cause a overflow when both high and low are large that makes the loop forever while start+(end-start)/2 will not.
            if(isBadVersion(mid)) end = mid;
            else start = mid + 1;
        }
        return start;
    }
}
