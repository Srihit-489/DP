class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] data = new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++){
            for(int j=0;j<triangle.size();j++){
                data[i][j] = -99999;
            }
        }
        int min = triangle.get(0).get(0);
        min = getmin(triangle,0,0,data);
        return min;
    }
    
    public int getmin(List<List<Integer>> mylist,int hero,int height,int[][] data){
        if(data[height][hero] != -99999){
            return data[height][hero];
        }
        int min = mylist.get(height).get(hero);
        if(height < mylist.size()-1){
            int localmin = Math.min(getmin(mylist,hero,height+1,data),getmin(mylist,hero+1,height+1,data)); 
            min += localmin;
        }
        
        data[height][hero] = min;
        return data[height][hero];
    }
    
    
    
    
    
}
