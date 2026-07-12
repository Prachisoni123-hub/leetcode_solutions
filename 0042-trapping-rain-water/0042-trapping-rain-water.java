class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxwater =0;
        int leftmax =0;
        int rightmax =0;
        int left=0;
        int right = n-1;

        // start
        while(left < right){
            if(height[left] < height[right])
            {
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }else{
                    maxwater += leftmax - height[left];
                }
                left++;
            }else{
                    if(height[right] >= rightmax){
                        rightmax = height[right];
                    }else{
                        maxwater += rightmax - height[right];
                    }
                    right--;
                }
            }
              return maxwater;
        
    }
}