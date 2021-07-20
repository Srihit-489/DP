class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        boolean[][] data = new boolean[n][n];
        int max = 0;
        
        for(int i=0;i<n;i++){
            data[i][i] = false;
        }
        
        for(int i=0;i<n-1;i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                data[i][i+1] = true;
                max = 2;
            }
        }
        
        
        //boolean skipcode = false;
        
        
        for(int i=3;i<n;i++){
            
            for(int j=0;j+i<n;j++){
                if(i%2 == 0){
                    continue;
                }
                
               
                
                
                data[j][j+i] = isvalid(s,j,j+i,data);
                if(data[j][j+i]){
                    max = Math.max(max,i+1);
                   
                    
                }
            }
        }
        
        return max;
        
    }
    
    public static boolean isvalid(String s,int start,int end,boolean[][] data){
        if(!(s.charAt(start) == '(' && s.charAt(end) == ')')){
            return false;
        }
        boolean case1 =  data[start+1][end-1];
        if(case1){
            return true;
        }
        boolean case2 = chance2(s,start,end,data);
        if(case2){
            return true;
        }else{
            return false;
        }
        
    }
    
    public static boolean chance2(String s,int start,int end,boolean[][] data){
        for(int i=1;start+i<end;i+=2){
            if(data[start][start+i] && data[start+i+1][end]){
                return true;
            }
        }
        return false;
        
    }
    
    
    
}
