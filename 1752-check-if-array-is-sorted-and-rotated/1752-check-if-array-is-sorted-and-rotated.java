class Solution {
    public boolean check(int[] nums) {
        int D = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
              D++;  
            } 
        }
        if(nums[nums.length-1]>nums[0]){
            D++;
        }
        return D<=1;
    }
}