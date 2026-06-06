class Solution {
    public int captureForts(int[] forts) {

        int left = 0;
        int max = 0;

        while (left < forts.length && forts[left] == 0) {
            left++;
        }

        int right = left + 1;

        while (right < forts.length) {

            if (forts[right] != 0) {

                if (forts[left] != forts[right]) {
                    max = Math.max(max, right - left - 1);
                }

                left = right;
            }

            right++;
        }

        return max;
    }
}