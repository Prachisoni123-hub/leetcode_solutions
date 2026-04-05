class Solution {
    public String reverseWords(String s) {
        // reversing the whole string at first
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
          
          // now the string will be sb instead of s
          int n = sb.length();
           int i =0;
           String result = "";
           // for th extra space only
           while ( i <n){
            while (i < n && sb.charAt(i) == ' ') i++;
            String word = " ";
             while (i < n && sb.charAt(i) != ' '){
               word += sb.charAt(i);
               i++;
             }

             // reverse again 
             String reversed = new StringBuilder(word).reverse().toString();
             // storing in final string result
         if(reversed.length() > 0){
            result += reversed;
         }
  
           }
return result.trim();
        
    }
}