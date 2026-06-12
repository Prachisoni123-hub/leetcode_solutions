class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
       List<String> result = new ArrayList<>();
       
       for(int i = 0;i<n;i++){
        int start = nums[i];
        // move while consecutive 

        while(i+1 < n && nums[i]+1 == nums[i+1]){
            i++;
        }
        int end = nums[i];
        if( start == end){
            result.add(String.valueOf(start));
        }else{
            result.add(start + "->" + end);
        }
       }
   return result;
        
    }
}