class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[][] data = new int[n][n];
        int max = 0;
        for(int i = 0;i<n;i++){
            data[i][i] = heights[i];
            max = Math.max(heights[i],max);
        }
        
        for(int i = 1;i<n;i++){
            for(int j = 0;j+i < n;j++){
                data[j][j+i] = Math.min(data[j][j+i-1],heights[j+i]);
                max = Math.max(data[j][j+i]*(i+1),max);
            }
        }
        
        return max;
            
    }
}
