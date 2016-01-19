public class Solution {
    public void rotate(int[][] a) {
        if(a.length==0) return;
        int n = a.length;
        int top = 0;
    	for(int i=0; i<n/2; i++){
    		for(int j=i; j<n-i-1; j++){
    			top = a[i][j];
    			a[i][j] = a[n-j-1][i]; //left -> top
    			a[n-j-1][i] = a[n-i-1][n-j-1]; //bottom -> left
    			a[n-i-1][n-j-1] = a[j][n-i-1]; //right -> bottom
    			a[j][n-i-1] = top; //top -> right
    		}
    	}
        return;
    }
}