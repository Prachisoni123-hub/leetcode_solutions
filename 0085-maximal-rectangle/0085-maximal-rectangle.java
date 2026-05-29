class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }

            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {

            int currHeight = (i == heights.length) ? 0 : heights[i];

            while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                int height = heights[st.pop()];

                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();

                int width = right - left - 1;
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        return maxArea;
    }
}