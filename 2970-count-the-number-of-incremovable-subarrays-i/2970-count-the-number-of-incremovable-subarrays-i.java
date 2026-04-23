class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                
                int prev = Integer.MIN_VALUE;
                boolean isIncreasing = true;

                for(int k = 0; k < n; k++){
                    
                    // skip removed subarray
                    if(k >= i && k <= j) continue;

                    if(nums[k] <= prev){
                        isIncreasing = false;
                        break;
                    }

                    prev = nums[k];
                }

                if(isIncreasing) count++;
            }
        }

        return count;
    }
}