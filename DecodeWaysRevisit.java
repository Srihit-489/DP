class Solution {
    public int numDecodings(String s) {
        int[] data = new int[s.length()+1];
        if(s.charAt(0) == '0')
            return 0;
        data[0] = 1;
        data[1] = 1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == '0'){
                if(s.charAt(i-1) == '1' || s.charAt(i-1) == '2')
                    data[i+1] = data[i-1];
                else
                    return 0;
            }else{
                if(s.charAt(i-1) == '1')
                    data[i+1] = data[i] + data[i-1];
                else if(s.charAt(i-1) == '2' && s.charAt(i) <= '6' && s.charAt(i) >= '0')
                    data[i+1] = data[i] + data[i-1];
                else
                    data[i+1] = data[i];
            }
        }
        return data[s.length()];
    }
}
