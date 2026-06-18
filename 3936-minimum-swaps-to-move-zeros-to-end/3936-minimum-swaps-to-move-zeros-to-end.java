class Solution {
    public int minimumSwaps(int[] nums) {
        
        int count =0;
        int n = nums.length;
        for( int i =0;i< n;i++){
        for( int j = n-1;j>i;j--){
            if( nums[i] ==0 && nums[j] !=0 ){
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                count++;
            }
        }
        }
        return count;
    }
}