class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder st = new StringBuilder();
        for(char ch : s.toCharArray()){
            if( ch == '('){
                if(count > 0) st.append(ch);
                 count++;  
        }else{
            count --;
           if(count>0) st.append(ch);
        }
        }
        return st.toString();
        
    }
}