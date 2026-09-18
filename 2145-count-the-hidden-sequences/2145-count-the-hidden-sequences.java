class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long current = 0;
        long minPrefix = 0;
        long maxPrefix = 0;
        
        // Track minimum and maximum prefix sums relative to hidden[0]
        for (int diff : differences) {
            current += diff;
            minPrefix = Math.min(minPrefix, current);
            maxPrefix = Math.max(maxPrefix, current);
        }
        
        // Determine valid range for hidden[0]
        // All elements must be within [lower, upper]
        long minAllowed = lower - minPrefix;
        long maxAllowed = upper - maxPrefix;
        
        // Count valid starting values
        long count = maxAllowed - minAllowed + 1;
        return Math.max(0, (int) count);
    }
}