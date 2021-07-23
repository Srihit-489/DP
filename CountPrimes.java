class Solution {
    public int numSquares(int n) {
        int data[] = new int[n+1];
        data[0] = 0;
        data[1] = 1;
        for(int i=2;i<=n;i++){
            data[i] = getcount(i,data);
        }
        return data[n];
    }
    public int getcount(int n,int[] data){
        if(n == 0){
            return 0;
        }
        if(data[n] != 0){
            return data[n];
        }
        int i = (int)Math.sqrt((double)n);
        int min = n;
        while(i > 0){
            min = Math.min(min,getcount(n-i*i,data)+1);
            i--;
        }
        data[n] = min;
        return data[n];
    }
    
}
