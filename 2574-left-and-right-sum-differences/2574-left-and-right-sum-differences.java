class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum  =0;
        int left =0;
        int[] ans = new int[nums.length];
        for(int i =0 ;i< nums.length ;i++)
        {
            sum+=nums[i];

        }

        // Calculate answer
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];                 // right sum
            ans[i] = Math.abs(left - sum);
            left += nums[i];
        }
        return ans;
    }
}