class Solution {
    public int numRescueBoats(int[] people, int limit) {

        int n = people.length;
        int count = 0;
        int i = 0;
        int j = n-1;
        Arrays.sort(people);

        while( i <= j) {
            int sum = people[i] + people[j];
          if(  sum <= limit )
          { 
            count++;
            i++;
            j--;
          }else if (sum > limit){
            count++;
            j--;
            
          }
        }
        return count;

        
    }
}