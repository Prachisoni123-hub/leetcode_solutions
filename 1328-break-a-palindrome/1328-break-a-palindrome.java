class Solution {
    public String breakPalindrome(String str) {
       
        char ch[] = str.toCharArray();
         int n  = ch.length;

          // Single character palindrome ko break nahi kar sakte
        if (n == 1) {
            return "";
        }

        for( int i=0;i<n/2;i++)
        {
            if(ch[i] != 'a')
            {
                ch[i] = 'a';
                return new String(ch);
            }
        }
        // or agar sare characters 'a' hi milrhe h to iss loop s bahar agye
        // so hum last wale character ko 'b' bnadenge
        ch[n-1] = 'b';
        
        return new String(ch);
        
    }
}