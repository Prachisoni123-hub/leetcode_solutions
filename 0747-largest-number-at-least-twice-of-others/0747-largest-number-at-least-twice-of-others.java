import java.util.*;

class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        //find max and its original index
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        //  sort array
        Arrays.sort(nums);

        //  get second max
        int secondMax = nums[n - 2];

        //  check condition
        if (max >= 2 * secondMax) {
            return index;
        }

        return -1;
    }
}