class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int count =1;
        int max =1;
            if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int i =0;
        while(i<n-1)
        {
            if(nums[i] == nums[i+1])
            {
                i++;
                continue;
            }
            if( nums[i+1] == nums[i] +1)
            count++;
            else count =1;

            max = Math.max(max,count);
            i++;
        }
        return max;
        
    }
}