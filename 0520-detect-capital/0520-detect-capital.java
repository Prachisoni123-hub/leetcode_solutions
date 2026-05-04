class Solution {
    public boolean detectCapitalUse(String word) {
    char[] arr = word.toCharArray();
      int count = 0;

        for (char ch : arr) {
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
           if (count == 0) return true;
        if (count == arr.length) return true;
        if (count == 1 && arr[0] >= 'A' && arr[0] <= 'Z') return true;

        return false;
    }
}