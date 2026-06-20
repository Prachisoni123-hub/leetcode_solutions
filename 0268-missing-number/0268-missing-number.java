class Solution {
    public int missingNumber(int[] nums) {
        
        int xor1 =0;
        int xor2 =0;
        for( int i =1;i<=nums.length;i++){
            xor1^=i;
        }
        for( int ele:nums){
            xor2^=ele;
        }
        return xor1^xor2;
   }
}