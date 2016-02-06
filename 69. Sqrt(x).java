public class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        int left = 1;
        int right = x;
        int mid = 1;
        while(left<=right){
            mid = (left + right) /2;
            if(mid == x / mid) return mid;
            else if(mid > x / mid) right = mid-1;
            else left = mid + 1;
        }
        return Math.min(left, right);
    }
}