class Solution {
    public String reverseWords(String s) {
        String[]a=s.split(" ");
        int len=a.length;
        String res=a[len-1];
        for(int i=len-2;i>=0;i--){
            if(a[i]=="")continue;
            res=res+" "+a[i];
            
        }
        return res;
    }
}