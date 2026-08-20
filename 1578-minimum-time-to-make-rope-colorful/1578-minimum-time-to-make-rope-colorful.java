class Solution {
    public int minCost(String colors, int[] neededTime) {


        char ch[] = colors.toCharArray();
        int n = ch.length;
        int m = neededTime.length;
        int mincost =0;
        
        int i=1;
        int  j=1;
         while( i <n && j <m)
         {
       if(ch[i] == ch[i-1])
       {
        mincost += Math.min(neededTime[j] , neededTime[j-1]);
        neededTime[j] = Math.max(neededTime[j], neededTime[j - 1]);
        i++;
        j++;
       }
       else{
        i++;
        j++;
       }
         }

         return mincost;
        
    }
}