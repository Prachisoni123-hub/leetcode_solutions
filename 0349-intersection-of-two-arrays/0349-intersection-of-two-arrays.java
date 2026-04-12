class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < n; i++){

            boolean alreadyPresent = false;

            // check if already added
            for(int k = 0; k < list.size(); k++){
                if(list.get(k) == nums1[i]){
                    alreadyPresent = true;
                    break;
                }
            }

            if(alreadyPresent) continue;

            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]){
                    list.add(nums1[i]);
                    break;
                }
            }
        }

        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
    }
}