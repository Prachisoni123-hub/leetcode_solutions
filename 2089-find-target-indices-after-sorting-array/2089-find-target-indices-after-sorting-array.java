import java.util.*;

class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                ans.add(i);
            }
        }

        return ans;
    }
}