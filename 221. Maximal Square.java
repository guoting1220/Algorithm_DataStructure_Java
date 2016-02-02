public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0) return 0;
        int min = 0;
        int m = matrix.length;
        int n = matrix[0].length;        
        int[][] result = new int[m][n]; //hard to do it in place(int --> char: 1-->'1')
        int maxResult = 0;
        for(int i=0; i<m; i++){
            result[i][0] = matrix[i][0]-'0';
            if(result[i][0]==1) maxResult = 1;  // !!!! in case only 1 col
        }
        for(int i=0; i<n; i++){
            result[0][i] = matrix[0][i]-'0';
            if(result[0][i]==1) maxResult = 1;  // !! in case only 1 row
        }
      
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]=='1'){
                    min = Math.min(Math.min(result[i-1][j], result[i][j-1]), result[i-1][j-1]);
                    result[i][j] = min + 1;
                    maxResult = Math.max(maxResult, result[i][j]);
                }
            }
        }
        return maxResult*maxResult;
    }
}