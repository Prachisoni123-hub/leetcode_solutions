class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for( int i =0;i<tokens.length;i++)
        {
           if(!st.isEmpty() && tokens[i] .equals("+"))
           {
            int a = st.pop();
            int b = st.pop();
            int sum = a+b;
            st.push(sum);
           } 
             else if(!st.isEmpty() && tokens[i] .equals("*"))
           {
            int a = st.pop();
            int b = st.pop();
            int product = a*b;
            st.push(product);

           }
           else if(tokens[i].equals("-"))
           {
          int a = st.pop();
          int b = st.pop();
          int subtraction = b-a;
           st.push(subtraction);
            }
          
           
           else if(!st.isEmpty() && tokens[i] .equals("/"))
           {
            int a = st.pop();
            int b = st.pop();
            int division = b/a;
            st.push(division);

           }
          else { st.push(Integer.parseInt(tokens[i]));
          }
        }
        return st.peek();
    }
}