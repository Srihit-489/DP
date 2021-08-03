class Solution {
    public int longestWPI(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] > 8 ? 1 : -1;
        }
        int max = 0;
        int[][] data = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            data[i][i] = arr[i];
            if(data[i][i] > 0){
                max = 1;
            }
        }
        
        for(int i=1;i<arr.length;i++){
            for(int j=0;i+j<arr.length;j++){
                data[j][j+i] = data[j][j+i-1] + arr[j+i];
                if(data[j][j+i] > 0){
                    max = Math.max(max,i+1);
                }
            }
        }
       
        
        return max;
    }
}


// 85/98
