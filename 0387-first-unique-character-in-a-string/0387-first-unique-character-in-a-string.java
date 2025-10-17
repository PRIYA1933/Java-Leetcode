class Solution {
    public int firstUniqChar(String s) {
      
        char[]a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]==' '){
                continue;
            }
              int count=1;//reset count for each i
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                count++;
                a[j]=' ';
                }
            }
        
        
        if(count==1){
            return i;
        }

        }
        return -1;
        
    }
}