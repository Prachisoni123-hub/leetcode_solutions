class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count =0;

        for( int i=0;i<n;i++)
        {
            if(s.charAt(i) == '(')
            {
                if(count >0){
                    sb.append(s.charAt(i));
                }
                count++;
            }else{
            count--;
            if(count >0){
                sb.append(s.charAt(i));
            }
        }
        }
        return sb.toString();
        
    }
}