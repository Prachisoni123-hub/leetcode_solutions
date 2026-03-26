import java.util.*;

class Solution {
    static List<List<Integer>> res;

    public static void helper(int i, int[] arr, ArrayList<Integer> ans) {
        if (i == arr.length) {
            res.add(new ArrayList<>(ans)); // copy list
            return;
        }

        // exclude
        helper(i + 1, arr, ans);

        // include
        ans.add(arr[i]);
        helper(i + 1, arr, ans);

        // backtrack
        ans.remove(ans.size() - 1);
    }

    public List<List<Integer>> subsets(int[] arr) {
        res = new ArrayList<>();
        helper(0, arr, new ArrayList<>());
        return res;
    }
}