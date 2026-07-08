class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        int m = s.length();
        
        // 1. Precompute powers of 10 for O(1) alignment
        long[] pow10 = new long[m + 1];
        pow10[0] = 1;
        for (int i = 1; i <= m; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        // 2. Build prefix arrays to capture state variations
        int[] prefixSum = new int[m + 1];    // To track sum of digits
        int[] prefixCount = new int[m + 1];  // To track total non-zero digits
        long[] prefixHash = new long[m + 1];  // To track rolling concatenated value

        for (int i = 1; i <= m; i++) {
            int digit = s.charAt(i - 1) - '0';
            
            prefixSum[i] = prefixSum[i - 1] + digit;
            prefixCount[i] = prefixCount[i - 1] + (digit != 0 ? 1 : 0);
            
            // Append only if the digit is non-zero
            if (digit != 0) {
                prefixHash[i] = (prefixHash[i - 1] * 10 + digit) % MOD;
            } else {
                prefixHash[i] = prefixHash[i - 1];
            }
        }

        // 3. Process each query dynamically in O(1)
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            
            int totalNonZeros = prefixCount[r + 1] - prefixCount[l];
            long currentSum = prefixSum[r + 1] - prefixSum[l];

            
            long num = (prefixHash[r + 1] - (prefixHash[l] * pow10[totalNonZeros]) % MOD + MOD) % MOD;

            ans[i] = (int) ((num * currentSum) % MOD);
        }

        return ans;
    }
}