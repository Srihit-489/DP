class Solution {
    public int longestWPI(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] > 8 ? 1 : -1;
        }
        
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i];
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > 0){
                max = Math.max(max,i+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] - arr[i] > 0){
                    max = Math.max(max,j-i);
                }
            }
        }
        return max;
        
        
    }
}


// A - accepted
