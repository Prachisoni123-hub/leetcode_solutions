 import java.util.Arrays;
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
        public static void reverse(int nums[], int first, int last){

        
        while(first<last){
            // swap
            int temp= nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        } }
        public static void main(String args[]){
            Solution sol = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        sol.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
        }
         }
         
         
            

        
    