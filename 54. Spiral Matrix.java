public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix==null || matrix.length==0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(true){
            for(int i=left; i<=right; i++) result.add(matrix[top][i]); 
            top++;
            if(top>bottom || left>right) break;
            
            for(int i=top; i<=bottom; i++) result.add(matrix[i][right]); 
            right--;
            if(top>bottom || left>right) break;
            
            for(int i=right; i>=left; i--) result.add(matrix[bottom][i]); 
            bottom--;
            if(top>bottom || left>right) break;
            
            for(int i=bottom; i>=top; i--) result.add(matrix[i][left]); 
            left++;
            if(top>bottom || left>right) break;
        }
        return result;
    }
}