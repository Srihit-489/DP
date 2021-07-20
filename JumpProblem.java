class Solution {
    public boolean canJump(int[] arr) {
        if(arr.length == 1 || arr.length == 0){
            return true;
        }
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(i > max){
                return false;
            }
            max = Math.max(i+arr[i],max);
        }
        
        return max >= arr.length-1;
    }
}
