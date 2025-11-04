class Solution {
    public int totalFruit(int[] fruits) {
        int st=0;
        int maxLen=0;
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            int fruit=fruits[i];
            m.put(fruit,m.getOrDefault(fruit,0)+1);
            while(m.size()>2){
                int fruit1=fruits[st];
                m.put(fruit1,m.get(fruit1)-1);
                if(m.get(fruit1)==0)
                m.remove(fruit1);
                st++;
            }
            maxLen=Math.max(maxLen,i-st+1);
        }
        return maxLen;
    }
}