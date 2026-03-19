class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        // traverse in all string
        for(char c : s.toCharArray())
 {
            if(st.isEmpty()) 
                st.push(c);

            else if(c == st.peek()) 
                st.pop();

            else
                st.push(c);
        }
        
        String result = "";  // making emoty string to store the characters
         for(char c : st) // traverse and adding all unique char
            result += c;
          return result;
        
    }
}