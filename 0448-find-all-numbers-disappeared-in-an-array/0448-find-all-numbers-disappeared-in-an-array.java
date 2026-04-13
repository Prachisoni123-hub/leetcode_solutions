class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> unique = new ArrayList<>();

        int n = nums.length;

        // duplicates remove
        unique.add(nums[0]);
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                unique.add(nums[i]);
            }
        }

        // index wise check
        int i = 0;
        int j = 0;

        while (i < n) {
            if (j < unique.size() && unique.get(j) == i + 1) {
                j++;
            } else {
                list.add(i + 1);
            }
            i++;
        }

        return list;
    }
}