class Solution {
    public int maxVowels(String s, int k) {
        int i = 0;
        int j = k-1;
        int sum = 0;
        for(int a = 0; a<k; a++){
            if('a'== s.charAt(a) ||'e'== s.charAt(a) ||'i'== s.charAt(a) ||'o'== s.charAt(a) ||'u'== s.charAt(a)){
                sum++;
            }
        }
        int Msum = sum;
        while(j<s.length()-1){
            if('a'== s.charAt(i) ||'e'== s.charAt(i) ||'i'== s.charAt(i) ||'o'== s.charAt(i) ||'u'== s.charAt(i)){
                sum--;
            }
            i++;
            j++;
            if('a'== s.charAt(j) ||'e'== s.charAt(j) ||'i'== s.charAt(j) ||'o'== s.charAt(j) ||'u'== s.charAt(j)){
                sum++;
            }
            Msum = Math.max(sum,Msum);
        }
        return Msum;
    }
}