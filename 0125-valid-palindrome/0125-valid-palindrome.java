class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while( left < right)
        {
            // for left 
            while( left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

             // for right
             while( left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            // make characters to lowercase
            char leftch = Character.toLowerCase(s.charAt(left));
            char rightch = Character.toLowerCase(s.charAt(right));

            if(leftch != rightch)
            return false;
            left++;
            right--;
        }
        return true;
        
    }
}