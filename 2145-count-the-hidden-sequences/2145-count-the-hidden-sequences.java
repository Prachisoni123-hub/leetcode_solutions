class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {

        long sum = 0;
        long min = 0;
        long max = 0;

        for (int diff : differences) {
            sum += diff;

            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

        long left = lower - min;
        long right = upper - max;

        if (left > right)
            return 0;

        return (int)(right - left + 1);
    }
}