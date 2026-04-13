class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        
        int n = candyType.length;
        int count = 1; // first type counted

        for (int i = 1; i < n; i++) {
            if (candyType[i] != candyType[i - 1]) {
                count++;
            }
        }

        if (count < n / 2) {
            return count;
        } else {
            return n / 2;
        }
    }
}