//help!!
public class Solution {
  public int numIslands(char[][] grid) {
      if(grid==null || grid.length==0) return 0;
      int c = 0;
      for(int i=0; i<grid.length; i++){
          for(int j=0; j<grid[0].length; j++){
              if(grid[i][j]=='1'){
                  explore(grid, i, j);
                  c++;
              }
          }
      }
      return c;
  }
  
  public void explore(char[][] grid, int i, int j){
      grid[i][j] = 'x';  // mark the explored cell 
      if(i>0 && grid[i-1][j]=='1')  explore(grid, i-1, j);  // check up
      if(i<grid.length-1 && grid[i+1][j]=='1') explore(grid, i+1, j);  // down
      if(j>0 && grid[i][j-1]=='1')  explore(grid, i, j-1);  //left
      if(j<grid[0].length-1 && grid[i][j+1]=='1') explore(grid, i, j+1);  //right
  }
}
