class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;

        int i=0;
        int j = n-1;

        Arrays.sort(people);
        int minboat =0;

        while( i <=j )
        {
            int sum = people[i] +people[j];
            if( sum <= limit)
            {
                minboat++;
                i++;
                j--;
            }else{
                if(sum > limit)
                {
                    minboat++;
                    j--;
                }else{
                    minboat++;
                }
            }
        }
        return minboat;
        
    }
}