class Solution {
    public int[] asteroidCollision(int[] asteroids) {
      
      int n = asteroids.length;
      
    Stack<Integer> st = new Stack<>();

 for( int i =0;i<n;i++){
  // when collision happens
while( !st.empty() && asteroids[i] < 0 && st.peek() >0){
    // calculate sum
    int sum = st.peek() + asteroids[i];
    if(sum < 0) st.pop();
    else if(sum  > 0){ 
        asteroids[i] = 0;
         break;
    
    } else{
        // sum == 0
        st.pop();
        asteroids[i] = 0;
           asteroids[i] = 0;
        break;
        
    }
}
// ab baki k jab  != 0 rhnge tb hi push krenge
if( asteroids[i] != 0){
    st.push(asteroids[i]);

}
 } 
 // to print in reverse order
     int arr[] = new int[st.size()];
     int idx = arr.length-1;
     while(!st.isEmpty())
     {
        arr[idx] = st.pop();
        idx--;
     }
     return arr;   

    }
}