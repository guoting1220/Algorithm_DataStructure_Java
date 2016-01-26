public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int val = 1;
        int top=0, bottom=n-1, left=0, right=n-1;
        while(true){
          //  if(val>n*n) break;
            for(int i=left; i<=right; i++){
                result[top][i] = val++;
            }
            top++;
            if(val>n*n) break;
            
            for(int i=top; i<=bottom; i++){
                result[i][right] = val++;
            }
            right--;
            if(val>n*n) break;
            
            for(int i=right; i>=left; i--){
                result[bottom][i] = val++;
            }
            bottom--;
            if(val>n*n) break;
            
            for(int i=bottom; i>=top; i--){
                result[i][left] = val++;
            }
            left++;
            if(val>n*n) break;
        }
        return result;
    }
}