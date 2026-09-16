class Solution {
    public int countCommas(int n) {
        int count = 0;
        if(n>=1000 && n<=999999){
            count = n-999;
        }
        else if(n>=1000000 && n<=999999999){
            count = 99000 + (n - 999999)*2;
        }
        return count;
    }
}