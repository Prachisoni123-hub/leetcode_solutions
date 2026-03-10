class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> st  = new Stack();

        // sabme iterate krna h
        for(int i =0;i<n;i++)
        {

 // dekhenge ki stack empty nhii h and peek ki height surrent height se choti h
            while(!st.isEmpty()  && heights[st.peek()] <= heights[i])
            {
                // to pek++ krenge
                result[st.peek()]++;
                st.pop(); // then ussi ko pop krdenge peek ele mko
            }

            // agar ab bhi empty nhi h
             if(!st.isEmpty())
             {
                // to fr s eek ko hi ++ krenge
                result[st.peek()]++;
             }
             st.push(i);
        }
        return result;
    }
        
}