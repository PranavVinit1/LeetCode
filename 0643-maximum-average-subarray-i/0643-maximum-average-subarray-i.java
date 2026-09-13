class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k-1;
        int a = 0;
        int sum = 0;
        int Maxsum = 0;
        while(a<k){
            sum = sum+nums[a];
            a++;
        }
        Maxsum = sum;
        while(j<nums.length-1){
            sum = sum-nums[i];
            i++;
            j++;
            sum = sum+nums[j];
            Maxsum = Math.max(sum, Maxsum);
        }
        return (double)Maxsum/k;

    }
}