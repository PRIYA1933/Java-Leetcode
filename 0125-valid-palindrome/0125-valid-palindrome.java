class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String res="";
        
        for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
                if((ch>='a'&&ch<='z')|| (ch >= '0' && ch <= '9'))
                res+=ch;
            }
        
        int i=0;int j=res.length()-1;
        while(i<=j){
            if(res.charAt(i)!=res.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
        
    }
}