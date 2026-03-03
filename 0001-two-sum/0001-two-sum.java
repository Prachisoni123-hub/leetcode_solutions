class Solution {
    public int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {}; 
    }

    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        Solution sol = new Solution();
        int[] result = sol.twoSum(arr, target);
        if (result.length == 2) {
            System.out.println("Indices found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
