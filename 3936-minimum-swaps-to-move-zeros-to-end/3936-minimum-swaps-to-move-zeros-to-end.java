class Solution {
    public int minimumSwaps(int[] nums) {
        int  n = nums.length;
       int i =0;
       int j = n-1;
       int swaps = 00;
        while( i < j){
            while( i < j && nums[i] !=0){
                i++;
            }
            
            while( i < j && nums[j] ==0){
            j--;
            }
            
            if( i < j){
              

                  int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

            i++;
                j--;
                  swaps++;
                
            }
            

        }
return swaps;
        
    }
}