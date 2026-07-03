class Solution {

    public int splitArray(int[] nums, int k) {

        int low = 0, high = 0;

        for (int x : nums) {
            low = Math.max(low, x);
            high += x;
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    boolean canSplit(int[] nums, int k, int maxSum) {

        int count = 1;
        int sum = 0;

        for (int x : nums) {
            if (sum + x <= maxSum) {
                sum += x;
            } else {
                count++;
                sum = x;
            }
        }

        return count <= k;
    }
}