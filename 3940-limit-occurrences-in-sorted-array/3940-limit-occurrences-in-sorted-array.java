class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        int i = 1;
         int n = nums.length;
         int count = 1;

         int[] ans = new int [n];
         int p = 0;

         ans[p++] = nums[0];

        while( i < n){
            
            // for equal
            if( nums[i] == nums[i-1]){
                count++;
            
                 if(count  <= k){
                    ans[p++] = nums[i];
                }

               } else{
                    count =1 ;
                    ans[p++] = nums[i];
                }
                i++;
            }
        return Arrays.copyOf(ans,p);
        
    }
}