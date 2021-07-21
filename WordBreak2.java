class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        //boolean data[] = new boolean[n+1];
       // data[0] = true;
        List<String> stringlist = new ArrayList<>();
        words(stringlist,0,s,wordDict,new StringBuilder());
        return stringlist;
        
    }
    
    public void words(List<String> stringlist,int hero,String str,List<String> dict,StringBuilder sb){
        if(hero == str.length()){
            sb.deleteCharAt(sb.length()-1);
            stringlist.add(sb.toString());
        }
        for(int i = hero+1;i<=str.length();i++){
            String substring = str.substring(hero,i);
            if(dict.contains(substring)){
                StringBuilder newsb = new StringBuilder(sb); 
                newsb.append(substring);
                newsb.append(" ");
                words(stringlist,i,str,dict,newsb);
                
            }
        }
    }
    
}
