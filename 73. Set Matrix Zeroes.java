public class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> r0 = new HashSet<Integer>();
        HashSet<Integer> c0 = new HashSet<Integer>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    r0.add(i);
                    c0.add(j);
                }
            }
        }
        for(int k : r0){
            for(int i=0; i<cols; i++){
                matrix[k][i] = 0;
            }
        }
        for(int k : c0){
            for(int i=0; i<rows; i++){
                matrix[i][k] = 0;
            }
        }
    }
}