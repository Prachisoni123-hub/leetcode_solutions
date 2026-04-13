class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> posList = new ArrayList<>();
        ArrayList<Integer> negList = new ArrayList<>();

        // Step 1: separate positives & negatives
        for (int num : nums) {
            if (num > 0) {
                posList.add(num);
            } else {
                negList.add(num);
            }
        }

        // Step 2: merge alternately
        int[] arr = new int[nums.length];
        int i = 0, j = 0;

        for (int k = 0; k < nums.length; k++) {
            if (k % 2 == 0) {
                arr[k] = posList.get(i++);
            } else {
                arr[k] = negList.get(j++);
            }
        }

        return arr;
    }
}