class Solution {
    public int calPoints(String[] operations) {

        int ans = 0;
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            // Number
            if (!op.equals("+") && !op.equals("D") && !op.equals("C")) {
                st.push(Integer.parseInt(op));
            }
            // +
            else if (op.equals("+")) {
                int b = st.pop();
                int a = st.pop();

                st.push(a);
                st.push(b);
                st.push(a + b);
            }
            // D
            else if (op.equals("D")) {
                st.push(st.peek() * 2);
            }
            // C
            else if (op.equals("C")) {
                st.pop();
            }
        }

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        return ans;
    }
}