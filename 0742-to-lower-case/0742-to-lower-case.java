class Solution {
    public String toLowerCase(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                res+=(char)(c+32);
            }else{
                res+=c;
            }
        }
        return res;
        
    }
}