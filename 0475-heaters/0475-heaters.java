class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int ans =0;
        for( int house : houses){
            int nearest = Integer.MAX_VALUE;
            for(int heater : heaters){
            int distance = Math.abs(house - heater);
            nearest = Math.min(nearest,distance);
            }
            ans = Math.max(ans,nearest);
        }
        return ans;
        
    }
}