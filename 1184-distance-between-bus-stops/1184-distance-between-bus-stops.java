class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        

        int n = distance.length;

        // for forward
        int distance1 = 0;
        int i = start;
        while( i != destination){
            distance1 +=distance[i];
            i = (i + 1) % n;
        }
        // backward 

       int distance2 = 0;
              i = start;

           while (i != destination) {
              i = (i - 1 + n) % n;
           distance2 += distance[i];
        }  
        return Math.min(distance1 ,distance2);
        
    }
}