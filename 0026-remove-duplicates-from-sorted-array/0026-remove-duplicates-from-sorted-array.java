class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        if(arr.length ==0) return 0;
        for(int j=1;j< n;j++)
        {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
                    
            }
        }
        return i+1;
    }
}