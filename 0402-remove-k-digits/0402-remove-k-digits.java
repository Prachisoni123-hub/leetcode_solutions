import java.util.*;

class Solution {
    public String removeKdigits(String num, int k) {
        
        int n = num.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        String ans = "";

        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        int idx = 0;
        while (idx < ans.length() && ans.charAt(idx) == '0') {
            idx++;
        }

        ans = ans.substring(idx);

        if (ans.length() == 0) {
            return "0";
        }

        return ans;
    }
}