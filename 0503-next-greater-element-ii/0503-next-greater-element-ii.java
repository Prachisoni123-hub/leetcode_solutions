class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // array ko double krrhe h
        for( int i =2*n ; i>=0 ;i--)
        {
            int index = i%n; // to map extra part to ans array
            while(!st.isEmpty() && st.peek() <= nums[index]){
                st.pop();
            }
           if(i < n){
            if(st.isEmpty())
            {
                ans[index] = -1;
            }else{
                ans[index] = st.peek();
            }
           }
           st.push(nums[index]);

        }
        return ans;
        
        
    }
}