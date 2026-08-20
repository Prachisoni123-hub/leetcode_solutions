class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
           int n = capacity.length;
            
            // new aray for capacities required
           int need[] = new int[n];
           
           for( int i=0;i<n;i++)
           {
            need[i] = capacity[i] - rocks[i];

           }

           // sort the need array after filling the capacities
           Arrays.sort(need);

           int count =0;
           for( int i=0;i<n;i++)
           {
            if(need[i] <= additionalRocks)
            {
                additionalRocks -= need[i];
                count++;

            }else{
                break;
            }
           }
       return count;

    }
}