class Solution {
    public boolean isvowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        char[]c=s.toCharArray();
        int vowel=0;
        for(int i=0;i<k;i++){
        if( isvowel(c[i]))
        vowel++;
            }
        
        int maxvowel=vowel;
        for(int i=k;i<c.length;i++){
            if(isvowel(c[i]))
            vowel++;
            if(isvowel(c[i-k]))
            vowel--;
           maxvowel= Math.max(vowel,maxvowel);
        }
return maxvowel;
    }
}