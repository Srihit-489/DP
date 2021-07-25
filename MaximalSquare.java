class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = row>0?matrix[0].length : 0;
        int[][] data = new int[row+1][col+1];
        int max = 0;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(matrix[i-1][j-1] == '1' ){
                    data[i][j] = Math.min(Math.min(data[i-1][j],data[i][j-1]),data[i-1][j-1])+1;
                    max = Math.max(data[i][j],max);
                }
            }
        }
        return max*max;
    }
}
