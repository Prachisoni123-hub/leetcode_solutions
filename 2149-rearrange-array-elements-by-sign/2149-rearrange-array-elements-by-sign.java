class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            list.add(0);
        }

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                list.set(pos, nums[i]);
                pos += 2;
            } else {
                list.set(neg, nums[i]);
                neg += 2;
            }
        }

        int[] arr = new int[n];
        int i = 0;
        for (int ele : list) {
            arr[i] = ele;
            i++;
        }

        return arr;
    }
}