class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count =0;
        char[] arr = word.toCharArray();
        for(char ch : arr){
            if( ch >= 'A' && ch<= 'Z' ){
                count++;
            }
        }
         if( count ==0) return true;
            else if(count == n) return true;
            else if(count == 1 && arr[0] >='A' && arr[0] <='Z') return true;
        
        return false;
        
    }
}