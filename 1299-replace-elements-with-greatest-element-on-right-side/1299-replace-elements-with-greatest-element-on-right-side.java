class Solution {
    public int[] replaceElements(int[] arr) {
        int g = arr[arr.length-1];
        int temp = 0;
        for(int i = arr.length-1; i>=0; i--){
            temp = arr[i];
            arr[i] = g;
            if(g < temp){
                g = temp;
            }
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}