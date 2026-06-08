class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<o.length;i++){
            if(o[i].equals("D")) s.push(2*s.peek());
            else if(o[i].equals("C")) s.pop();
            else if(o[i].equals("+")) {
                int top=s.pop();
                int sum=top+s.peek();
                s.push(top);
                s.push(sum);
            }
            else{
                int x=Integer.parseInt(o[i]);
                s.push(x);
            }
        }
        int sum=0;
        while(s.size()!=0){
            sum=sum+s.pop();
        }
        return sum;
    }
}