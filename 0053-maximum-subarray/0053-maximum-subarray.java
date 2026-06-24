class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum =0;
        int maxsum= nums[0];
        int n = nums.length;

        for( int i = 0 ; i<n ; i++){
            currentsum += nums[i];
 
          if( currentsum > maxsum) maxsum = currentsum;
  
  if ( currentsum < 0) currentsum =0;
        }
        return maxsum;
        
    }
}