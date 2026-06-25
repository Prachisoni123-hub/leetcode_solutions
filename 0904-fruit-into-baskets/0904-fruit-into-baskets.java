class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int maxlen = 0;
        int i=0;
        int j=0;

        Map<Integer ,Integer> map = new HashMap<>();
        // frequency store krli sbki

        while( j <n){
            // agar already hai
            if(map.containsKey(fruits[j])){
                // to jitni h usse 1 jyada krdo
                int freq = map.get(fruits[j]);
                map.put(fruits[j],freq+1);
            }
            // freq 1 hi rehnedo valuek sath map me
            else map.put(fruits[j],1);

                // size check kro
            while(map.size() >2){
                int freq = map.get(fruits[i]);
                // agar freq ek  to remove krdo
                 if(freq ==1) map.remove(fruits[i]);
                 else map.put(fruits[i], freq-1);
                 // i++ krdo
                 i++;
            }
            // agar nhi h length > 2 to len nikalo maxlen nikalo j++ krdo

            int len = j-i+1;
            maxlen = Math.max(maxlen ,len);
            j++;
        }
        return maxlen;
    }
}