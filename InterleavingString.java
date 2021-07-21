class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        StringBuilder str1 = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(s2);
        StringBuilder str3 = new StringBuilder(s3);
        
        while(str3.length() != 0){
            if(str1.length() != 0 && str2.length() != 0 &&  str3.charAt(0) == str1.charAt(0) && str3.charAt(0) == str2.charAt(0)){
                StringBuilder dup1 = new StringBuilder(str1);
                StringBuilder dup2 = new StringBuilder(str2);
                StringBuilder dup3 = new StringBuilder(str3);
                dup1.deleteCharAt(0);
                dup3.deleteCharAt(0);
                boolean choice1 = isInterleave(dup1.toString(),str2.toString(),dup3.toString());
                if(choice1){
                    return true;
                }
                str2.deleteCharAt(0);
                str3.deleteCharAt(0);
                boolean choice2 = isInterleave(str1.toString(),str2.toString(),str3.toString());
                return choice2?true:false;
            }else if(str1.length() != 0 && str3.charAt(0) == str1.charAt(0)){
                str3.deleteCharAt(0);
                str1.deleteCharAt(0);
            }else if(str2.length() != 0 && str3.charAt(0) == str2.charAt(0)){
                str3.deleteCharAt(0);
                str2.deleteCharAt(0);
            }else{
                return false;
            }
        }
        
        return str1.length() == 0 && str2.length() == 0 ? true:false;
    }
}

// Not very efficient
