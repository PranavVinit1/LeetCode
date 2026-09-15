class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1) return 0;
        int[] Min = new int[nums.length];
        Min[nums.length-1] = nums[nums.length-1];
        for(int i = nums.length-2; i>=0; i--){
            Min[i] = Math.min(Min[i+1],nums[i]);
        }
        int Max = nums[0];
        for(int i = 0; i<nums.length; i++){
            Max = Math.max(Max,nums[i]);
            if((Max-Min[i])<=k){
                return i;
            }
        }
        return -1;
    }
}