class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count =1;

       StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++)
        {
            if(i+1 < n && chars[i]== chars[i+1])
            {
            count++;
            }
            else{
                sb.append(chars[i]);

                if(count >1)
                {
                    sb.append(count);
                }
                count =1;
            }
        }
        for(int i=0;i<sb.length();i++)
        {
            chars[i] = sb.charAt(i);
        }
      return sb.length();   
    }
}