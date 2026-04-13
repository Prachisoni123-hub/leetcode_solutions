class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int max = nums[n - 1];
        int secondmax = Integer.MIN_VALUE;
        int lastmax = Integer.MIN_VALUE;

        int count = 1; // max mil gaya

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) { // new distinct value
                count++;

                if (count == 2) {
                    secondmax = nums[i];
                } 
                else if (count == 3) {
                    lastmax = nums[i];
                    return lastmax;
                }
            }
        }

        return max; // agar 3 distinct nahi mile
    }
}