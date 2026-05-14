class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int n = nums.length;
        int i =0;
        int max = 1; // bcz array ki length 1 bhi hoskti h
        while(i<n-1){
            if( nums[i] == nums[i+1]) {
            i++;
            continue; // aagar dublicates hoto continue krlo 
        }
        if( nums[i+1] == nums[i] +1) count++;
        else count =1;
        
        max = Math.max(count,max);
        i++;
        }
return max;
    }
}