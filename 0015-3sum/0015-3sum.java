class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if( n < 3) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
         // loop for fix an element : n1
         for( int k =0;k<n-2;k++){
            if( k >0 && nums[k] == nums[k-1])continue;
         

         // now make target
         int n1 = nums[k];
         int target = -n1;

         // now two sum
         
         int i =k+1;
         int j = n-1;
         while(i<j){

         int sum = nums[i]+nums[j];
         if( sum == target) {
            ans.add(Arrays.asList(nums[k], nums[i] , nums[j]));i++;
            j--;
            // check for duplicates
         while( i<j && nums[i] == nums[i-1])i++;
         if(i<j && nums[j] == nums[j+1]) j--;

         } else if( sum > target) j--;
         else i++;
         }
    }
        return ans;
    }
}