public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m==0) return false;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n-1;
        int mid;
        int i, j;
        while(start<=end){
            mid = (start+end)/2;
            i = mid/n;
            j = mid%n;
            if(matrix[i][j]==target) return true;
            if(matrix[i][j]<target) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
}