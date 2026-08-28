class Solution {
    public int partitionString(String s) {

        // make new array
        int[]  lastseen = new int[26];
        Arrays.fill(lastseen,-1);

        int count =0; // for counting of substring
        int substringstart =0;

        for(int i =0; i <s.length() ; i++)
        {
            if(lastseen[s.charAt(i) - 'a'] >= substringstart)
            {
                count++;
                substringstart = i;
            }
            lastseen[s.charAt(i) - 'a'] = i;
        }
        return count+1;
        
    }
}