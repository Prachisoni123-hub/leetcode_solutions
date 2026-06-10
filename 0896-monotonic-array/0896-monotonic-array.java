class Solution {
    public boolean isMonotonic(int[] arr) {
        int n = arr.length;

        boolean flag1 = true; // increasing check
        boolean flag2 = true; // decreasing check

        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;

            if (arr[i] > arr[j]) {
                flag1 = false;
            }

            if (arr[i] < arr[j]) {
                flag2 = false;
            }
        }

        return flag1 || flag2;
    }
}