class Solution {
    public int findMin(int[] nums) {
        int Min = Integer.MAX_VALUE;
        int d = 0;
        for(int i = 0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
              d = i;  
            } 
        }
        while(d<nums.length){
            Min = Math.min(Min,nums[d]);
            d++;
        }
        return Min;
    }
}