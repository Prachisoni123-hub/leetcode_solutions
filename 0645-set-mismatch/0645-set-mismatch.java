import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int duplicate = -1;

        for (int i = 0; i < n; i++) {
            sum += nums[i];  // correct sum

            //  fix out of bounds
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                duplicate = nums[i];
            }
        }

        int totalSum = n * (n + 1) / 2;

        // correct formula
        int missingNumber = totalSum - (sum - duplicate);

        //  maintain ArrayList usage
        list.add(duplicate);
        list.add(missingNumber);

        // convert ArrayList to int[]
        return new int[]{list.get(0), list.get(1)};
    }
}