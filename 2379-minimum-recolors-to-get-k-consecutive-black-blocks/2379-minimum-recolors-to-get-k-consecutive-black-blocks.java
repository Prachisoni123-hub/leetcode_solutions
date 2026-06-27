class Solution {
    public int minimumRecolors(String blocks, int k) {
        int white =0;
        // first window
        for( int i =0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                white++;
            }
        }

        int ans  = white;

        // sliding window
        for( int i =0 ,j=k; j<blocks.length() ; i++,j++){

            if( blocks.charAt(i) == 'W'){
                white--;
            }
             if( blocks.charAt(j) == 'W'){
                white++;
            }
            ans = Math.min(ans,white);
        }
        return ans;

        
    }
}