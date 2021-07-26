class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[][] data = new int[n][n];
        int max = 0;
        for(int i=0;i<n;i++){
            data[i][i] = heights[i];
            max = Math.max(heights[i],max);
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                data[i][j] = Math.min(data[i][j-1],heights[j]);
                max = Math.max((j-i+1)*data[i][j],max);
            }
        }
        return max;
        
    }
}

//  87/96
