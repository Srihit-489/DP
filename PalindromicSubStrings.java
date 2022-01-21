class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n == 0)
            return 0;
        boolean[][] data = new boolean[n][n];
        for(int i = 0;i<n;i++)
            data[i][i] = true;
        int count = n;
        for(int i = 0;i<n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                data[i][i+1] = true;
                count++;
            }
        }
        
        for(int head = 2;head<n;head++){
            for(int i = 0;i+head < n;i++){
                if(s.charAt(i) == s.charAt(i+head) && data[i+1][i+head-1]){
                    data[i][i+head] = true;
                    count++;
                }
            }
        }
        
        return count;
    }
}
