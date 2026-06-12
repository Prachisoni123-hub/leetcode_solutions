class Solution {
    public int maxArea(int[] height) {
        int  n = height.length;
        int maxwater = 0;
        int i =0;
        int j = n -1;
        while( i < j)
        {
            int minimum = Math.min(height[i] , height[j]);
            maxwater = Math.max(maxwater,(j-i) * minimum);

            if(height[i] < height[j]) i++;
            else j--;
        }
        return maxwater;
    }
}