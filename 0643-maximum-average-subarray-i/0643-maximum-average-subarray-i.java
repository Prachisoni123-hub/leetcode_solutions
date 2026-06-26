class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        int i = 0, j = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (j < n) {
            sum += nums[j];

            // window size check
            if (j - i + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                // shrink window
                sum -= nums[i];
                i++;
            }

            j++;
        }

        return (double) maxSum / k;
    }
}