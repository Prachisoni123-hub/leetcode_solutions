import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int count = 1;
        int maxfreq = 1;
        int total = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > maxfreq) {
                    maxfreq = count;
                    total = count;
                } else if (count == maxfreq) {
                    total += count;
                }
                count = 1; // reset for new group
            }
        }

        // last group handle
        if (count > maxfreq) {
            maxfreq = count;
            total = count;
        } else if (count == maxfreq) {
            total += count;
        }

        return total;
    }
}