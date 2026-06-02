class Solution {
    public int earliestFinishTime(
        int[] landStartTime,
        int[] landDuration,
        int[] waterStartTime,
        int[] waterDuration
    ) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {

                // Case 1: Land -> Water
                int landEnd = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(landEnd, waterStartTime[j]);
                int finish1 = waterStart + waterDuration[j];

                // Case 2: Water -> Land
                int waterEnd = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterEnd, landStartTime[i]);
                int finish2 = landStart + landDuration[i];

                ans = Math.min(ans, Math.min(finish1, finish2));
            }
        }

        return ans;
    }
}