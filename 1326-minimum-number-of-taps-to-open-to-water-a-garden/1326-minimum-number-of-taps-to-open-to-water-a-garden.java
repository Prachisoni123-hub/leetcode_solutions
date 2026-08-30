class Solution {
    public int minTaps(int n, int[] ranges) {

        int[] startend = new int[n+1];

        for(int i=0;i<ranges.length;i++)
        {
            int start = Math.max(0, i - ranges[i]);
            int end  = Math.min (n ,i+ranges[i]);

            startend[start] = Math.max(startend[start] , end);
        }

        int taps =0;
        int currend =0;
        int maxend =0;

        for( int i=0;i<n+1;i++)
        {
            if(i > maxend) return -1;

            if( i >currend)
            {
                taps++;
                currend = maxend;
            }
            maxend = Math.max(maxend ,startend[i]);
        }
        return taps;
        
    }
}