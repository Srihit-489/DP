class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] data  = new int[n];
        data[0] = 1;
        int totalmax = 1;
        for(int i=1;i<n;i++){
            data[i] = getdata(nums,data,i);
            totalmax = Math.max(totalmax,data[i]);
        }
        return totalmax;
    }
    
    public int getdata(int[] nums,int[] data,int end){
        int max = 0;
        for(int i=0;i<end;i++){
            if(nums[i] < nums[end]){
                max = Math.max(data[i],max);
            }
        }
        return max+1;
    }
    
    
}
