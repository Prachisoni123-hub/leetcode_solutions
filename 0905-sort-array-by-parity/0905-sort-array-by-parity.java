class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for( int i =0;i<n;i++){
            if(nums[i] % 2 ==0){
                list.add(nums[i]);
            } 
        }
         for( int i =0;i<n;i++){
            if(nums[i] % 2 !=0){
                list.add(nums[i]);
            } 
        }
        
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}