class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
 // empty string which contains only letters and characters
 String first = " ";
 for(int i =0 ;i< n ;i++){
    char ch = s.charAt(i);
    if(Character.isLetterOrDigit(ch)){
        first +=Character.toLowerCase(ch);
    }
 }
  // new string from reverse
  String reverse = " ";
  for(int i = n-1 ;i>=0 ;i--){
    char ch = s.charAt(i);
      if(Character.isLetterOrDigit(ch)){
        reverse += Character.toLowerCase(ch);
      }

  }
  return first.equals(reverse);

        
    }
}