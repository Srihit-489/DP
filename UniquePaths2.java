class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        if(arr[0][0] == 1){
            return 0;
        }
        int[][] path = new int[arr.length][arr[0].length];
        return getcount(arr,0,0,path);
    }
    
    
    
    public int getcount(int[][] arr,int x,int y,int[][] path){
        
        if(x == arr.length-1 && y == arr[arr.length-1].length-1){
            return arr[x][y] == 1?0:1;
        }
        
        
        if(path[x][y] > 0){
            return path[x][y];
        }else if(path[x][y] == -1){
            return 0;
        }
        
        
        
        int count = 0;
        if(x+1 < arr.length && arr[x+1][y] != 1){
            count =  getcount(arr,x+1,y,path);
        }
        
        if(y+1 < arr[x].length && arr[x][y+1] != 1){
            count +=  getcount(arr,x,y+1,path);
        }
        path[x][y] = count == 0 ?-1:count;
        return count;
        
    }
}
