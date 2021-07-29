class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n == 0){
            return 0;
        }
        HashSet<Integer> myhash = new HashSet<Integer>();
        for(int i=0;i<primes.length;i++){
            myhash.add(primes[i]);
        }
        myhash.add(1);
        if(n == 1){
            return 1;
        }
        int count = 1;
        int i = 2;
       // int max = 0;
        int retvalue = 0;
        while(count <  n){
            for(int num : primes){
                if(i%num == 0 && myhash.contains(i/num)){
                    myhash.add(i);
                   // max = Math.max(max,i);
                    count++;
                    break;
                }
                
                    
            }
            if(count == n){
                retvalue = i;
            }
            i++;
        }
        return retvalue;
        
        
        
    }
}
