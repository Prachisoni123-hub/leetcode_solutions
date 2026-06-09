class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;
        
        int i = 0;
        int j =n-1;

        while (i<j) {
            int sum = numbers[i] + numbers[j];

         if(sum == target) {
            // it is one based indexing so we have to return i+1 and j+1
            return new int[] {i+1,j+1};
            }
           
        else if(sum > target){
       j--;
    }
    else {
        i++;
    }
    }
    return new int[] {};
    }
}