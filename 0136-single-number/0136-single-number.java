class Solution {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        int single = nums[0];
        for( int i =0;i<nums.length-1;i+=2)
        {
            if(nums[i] != nums[i+1]){
             single = nums[i];
                return single;
            } 
            
        }
        
         return nums[nums.length-1];
    }
}