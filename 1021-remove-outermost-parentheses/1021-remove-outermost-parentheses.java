class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
       int counter = 0;
        for (int i = 0; i < s.length(); i++) {
       char ch = s.charAt(i);
     if (ch == '(') {
                if (counter > 0) {
                    sb.append(ch);
                }
                counter++;
       }else{
         counter--;
                if (counter > 0) {
                    sb.append(ch);
       }

            
        }
        }
           return sb.toString();
    }
}