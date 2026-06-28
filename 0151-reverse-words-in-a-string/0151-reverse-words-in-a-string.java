class Solution {
    public String reverseWords(String s) {
        
        // remove spaces
         s = s.trim();

// make array of string and split the words
   String[] word = s.split("\\s+");

   StringBuilder sb = new StringBuilder();

    for( int i  = word.length-1 ; i >=0 ; i--){
         sb.append(word[i]);

        if( i !=0){
        sb.append(" ");
    }
 }
 return sb.toString();

        
    }
}