class Solution {
    public int longestSubarray(int[] nums) {
        int i =0;
        int zeroes = 0;
        int maxlen =0;
        int n = nums.length;

        for( int j =0 ;j<n ;j++){

            if( nums[j] == 0){
                zeroes++;
            }

    while(zeroes > 1){

        if(nums[i] == 0){
            zeroes--;
        }
        i++;
    }
    int len = j-i+1-1;
    maxlen = Math.max(maxlen , len);

        }
        return maxlen;
    }
}