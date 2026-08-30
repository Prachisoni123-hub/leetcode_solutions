class Solution {
    public int minDeletions(String s) {
        // approch 1

        HashSet<Integer> st = new HashSet<>();
        int[] freq = new int[26];

        for( char ch : s.toCharArray())
        {
            freq[ch - 'a']++;
        }

        int result =0;

        for( int i=0;i<26;i++)
        {
            while(freq[i] >0 && st.contains (freq[i]))
            {
                freq[i]--;
                result++;

            }
            st.add(freq[i]);
        }
        return result;

        
    }
}