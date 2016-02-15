public class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length==0 || board[0].length==0) return;
        int m=board.length;
        int n = board[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((board[i][j]&1)==1 && (numOfliveNeigbors(board, i, j)<2 || numOfliveNeigbors(board, i, j)>3)) board[i][j] = 1;
                else if(((board[i][j]&1)==1) && (numOfliveNeigbors(board, i, j)==2 || numOfliveNeigbors(board, i, j)==3)) board[i][j] = 3;
                else if((board[i][j]&1) == 0 && numOfliveNeigbors(board, i, j)==3) board[i][j] = 2;
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                board[i][j] = board[i][j]>>1;
            }
        }
        
        return;
    }
    
    public int numOfliveNeigbors(int[][] board, int x, int y){
        int m = board.length;
        int n = board[0].length;
        int sum = 0;
        for(int i=x-1; i<=x+1; i++){
            for(int j=y-1; j<=y+1; j++){
                if(!(i==x && j==y) && i>=0 && i<=m-1 && j>=0 && j<=n-1 && (board[i][j]&1)==1) sum += 1;  //board[i][j]&1 !!!
            }
        }
        return sum;
    }
}