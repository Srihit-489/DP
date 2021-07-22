class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        int n = s.length();
        List<Integer>[][] data = new ArrayList[n][n];
        List<Integer> finallist =  getvalues(s,0,n-1,data);
        return finallist;
        
    }
    
    
    public List<Integer> getvalues(String s,int start,int end,List<Integer>[][] data){
        if(data[start][end] != null){
            return data[start][end];
        }
        int retstatus = 0;
        
        List<Integer> newlist = new ArrayList<Integer>();
        
        for(int i=start;i<end;i++){
            if(checkop(s.charAt(i))){
                retstatus = 1;
                List<Integer> LHS = getvalues(s,start,i-1,data);
                List<Integer> RHS = getvalues(s,i+1,end,data);
                for(int lhs : LHS){
                    for(int rhs : RHS){
                        newlist.add(doop(lhs,rhs,s.charAt(i)));
                    }
                }
                
            }
        }
        
        if(retstatus == 0){
            newlist.add(Integer.parseInt(s.substring(start,end+1)));
            data[start][end] = newlist;
            return data[start][end];
        }else{
            data[start][end] = newlist;
            return data[start][end];
        }
        
        
    }
    
    public boolean checkop(char ch){
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
    
    public int doop(int a,int b,char ch){
        if(ch == '+'){
            return a+b;
        }else if(ch == '-'){
            return a-b;
        }else if(ch == '*'){
            return a*b;
        }else{
            return a/b;
        }
    }
    
    
}
