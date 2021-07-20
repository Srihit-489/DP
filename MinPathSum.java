class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 1 && grid[0].length == 1){
            return grid[0][0];
        }
        int[][] path = new int[grid.length][grid[0].length];
        path[0][0] = grid[0][0];
        for(int i=1;i<grid.length;i++){
            path[i][0] = path[i-1][0] + grid[i][0]; 
        }
        
        for(int j=1;j<grid[0].length;j++){
            path[0][j] = path[0][j-1]+grid[0][j];
        }
        return getmin(grid,grid.length-1,grid[0].length-1,path);
    }
    
    public int getmin(int[][] grid,int x,int y,int[][] path){
        if(path[x][y] != 0){
            return path[x][y];
        }else{
            int choice1 = x-1 >= 0? getmin(grid,x-1,y,path):0;
            int choice2 = y-1 >= 0? getmin(grid,x,y-1,path):0;
            path[x][y] = Math.min(choice1,choice2)+grid[x][y];
            return path[x][y];
        }
        
    }
    
    
}
