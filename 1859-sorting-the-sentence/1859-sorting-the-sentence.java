class Solution {
    public String sortSentence(String s) {

        String[] words = s.split(" ");
        String ans = "";

        for (int pos = 1; pos <= words.length; pos++) {

            for (String word : words) {

                int n = word.length();

                if (word.charAt(n - 1) - '0' == pos) {
                    ans += word.substring(0, n - 1) + " ";
                }
            }
        }

        return ans.trim();
    }
}