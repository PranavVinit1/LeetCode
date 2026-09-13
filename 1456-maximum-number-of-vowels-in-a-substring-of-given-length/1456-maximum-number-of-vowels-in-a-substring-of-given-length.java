class Solution {
    private boolean vowel(char c){
        return c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u';
    }
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = k-1;
        int sum = 0;
        for(int a = 0; a<k; a++){
            if(vowel(s.charAt(a))){
                sum++;
            }
        }
        int Msum = sum;
        while(j<s.length()-1){
            if(vowel(s.charAt(i))){
                sum--;
            }
            i++;
            j++;
            if(vowel(s.charAt(j))){
                sum++;
            }
            Msum = Math.max(sum,Msum);
        }
        return Msum;
    }
}