class Solution {
    public String breakPalindrome(String str) {

        char ch[] = str.toCharArray();
        int n = ch.length;

      if( n == 1)
      {
          return "";
      }        

        for( int i=0;i<n/2;i++)
        {
            if(ch[i]  != 'a')
            {
                ch[i] ='a';
                return new String(ch);
            }
        }
       
       ch[n-1] = 'b';
       return new String(ch);

        
    }
}