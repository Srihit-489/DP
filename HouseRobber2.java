class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        
        else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        
        int[] arr1 =  Arrays.copyOfRange(nums,0,nums.length-1);
        int[] arr2 = Arrays.copyOfRange(nums,1,nums.length);

        return Math.max(robstraight(arr1),robstraight(arr2));
        
        
    }
    

    public int robstraight(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = 0;
        int[] data = new int[nums.length];
        data[0] = nums[0];
        max = Math.max(max,data[0]);
        data[1] = nums[1];
        max = Math.max(max,data[1]);
        if(nums.length >= 3){
            data[2] = data[0] + nums[2];
            max = Math.max(data[2],max);
        }
        for(int i=3;i<nums.length;i++){
            int localmax = 0;
            localmax = Math.max(data[i-2]+nums[i],localmax);
            localmax = Math.max(data[i-3]+nums[i],localmax);
            data[i] = localmax;
            max = Math.max(max,data[i]);
        }
        return max;
    }
    
}
