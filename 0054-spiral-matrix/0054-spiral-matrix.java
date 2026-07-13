class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int down = m - 1;
        int left = 0;
        int right = n - 1;

        int id = 0;

        while (top <= down && left <= right) {

            // left to right
            if (id == 0) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
                top++;
                id = 1;
            }

            // top to down
            else if (id == 1) {
                for (int i = top; i <= down; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
                id = 2;
            }

            // right to left
            else if (id == 2) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[down][i]);
                }
                down--;
                id = 3;
            }

            // down to top
            else if (id == 3) {
                for (int i = down; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
                id = 0;
            }
        }

        return result;
    }
}