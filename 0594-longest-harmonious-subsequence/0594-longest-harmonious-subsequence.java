import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: frequency build (your method style)
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int maxLen = 0;

        // Step 2: check (x, x+1)
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int len = map.get(key) + map.get(key + 1);
                maxLen = Math.max(maxLen, len);
            }
        }

        return maxLen;
    }
}