class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        
        for(int i =0;i<arr.length-1;i++)
        {  
          // check all j within k distance from i
            for(int j = i + 1; j < arr.length && j <= i + k; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }}}
                return false;
        
    }
}