class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] ans = {-1, -1};
        int n = arr.length;

        // First occurrence
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans[0] = mid;
                high = mid - 1;   // move left
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        // Last occurrence
        low = 0;
        high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans[1] = mid;
                low = mid + 1;   // move right
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}