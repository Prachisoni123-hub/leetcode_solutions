class Solution {
    public int[] sortedSquares(int[] arr) {
         int n = arr.length;
        int newarr[] = new int[arr.length];
        int index  = n-1;
        int left = 0;
        int right = n-1;
        while(left <= right){
        int leftval = arr[left];
        int rightval = arr[right];
        
           if(Math.abs(leftval) > Math.abs(rightval))
           {
          newarr[index] = leftval * leftval;
             left++;

           }else{
            newarr[index] = rightval * rightval;
            right--;
           }
           index--;
        }
       return newarr;
     
    }
}