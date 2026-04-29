class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
    int n = ransomNote.length();
    int m = magazine.length();
    
        boolean[] used = new boolean[m];
    for(int i =0;i<n;i++){
        int j;
        for(  j=0;j<m;j++){
             if (!used[j] && ransomNote.charAt(i) == magazine.charAt(j)) {
                    used[j] = true;
                    break;
                }
            }

            if (j == m) {   // not found
                return false;
            }
        }

        return true;
        
    }
}