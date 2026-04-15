class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int mindistance = Integer.MAX_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                mindistance = Math.min(mindistance, Math.abs(i - start));
            }
        }

        return mindistance;
    }
}