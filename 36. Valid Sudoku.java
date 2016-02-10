public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board==null || board.length!=9 || board[0].length!=9) return false;
        for(int i=0; i<9; i++){
            if(!helper(board, i, 0, i, 8) || !helper(board, 0, i, 8, i)) return false;
        }
        for(int i=0; i<9; i=i+3){
            for(int j=0; j<9; j=j+3){
                if(!helper(board, i, j, i+2, j+2)) return false;
            }
        }
        return true;
    }
    
    public boolean helper(char[][] board, int x1, int y1, int x2, int y2){
        HashSet<Character> set = new HashSet<Character>();
        for(int i=x1; i<=x2; i++){
            for(int j=y1; j<=y2; j++){
                if(board[i][j]!='.'){    
                    if(board[i][j]>'9' || board[i][j]<'1' || !set.add(board[i][j])) return false;
                }
            }
        }
        return true;
    }
}