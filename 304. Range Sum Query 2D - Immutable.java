public class NumMatrix {
    int[][] a;
    
    public NumMatrix(int[][] matrix) {
        if(matrix==null || matrix.length==0) {
            a = matrix;
            return;
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        a = new int[m][n];
        a[0][0] = matrix[0][0];
        for(int i=1; i<m; i++)  a[i][0] = matrix[i][0] + a[i-1][0];
        for(int j=1; j<n; j++)  a[0][j] = matrix[0][j] + a[0][j-1];
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                a[i][j] = matrix[i][j] + a[i-1][j] + a[i][j-1] - a[i-1][j-1];
            }
        }
        return;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        if(a==null || a.length==0) return 0;
        int top = (row1==0)? 0 : a[row1-1][col2];
        int left = (col1==0)? 0 : a[row2][col1-1];
        int topLeft = (row1==0 || col1==0)? 0 : a[row1-1][col1-1];
        return a[row2][col2] - top - left + topLeft;
    }
}
