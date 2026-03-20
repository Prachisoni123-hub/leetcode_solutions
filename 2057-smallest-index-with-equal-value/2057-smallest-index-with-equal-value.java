class Solution {
    public int smallestEqual(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;  // smallest index mil gaya
            }
        }

        return -1; // agar koi match nahi mila
    }
}