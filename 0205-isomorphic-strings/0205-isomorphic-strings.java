class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] arr= new char[128];// null characters
        for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
         char dh = t.charAt(i);
         int idx = (int)ch;
         
         if (arr[idx]=='\0') arr[idx]=dh;
         else{
            if(arr[idx]!=dh) return false;
         }
      }
        char[] a= new char[128];// null characters
        for(int i=0;i<t.length();i++){
          char ch = t.charAt(i);
          char dh = s.charAt(i);
           int idx = (int)ch;
         
         if (a[idx]=='\0') a[idx]=dh;
         else{
            if(a[idx]!=dh) return false;
         }
      }
      return true;
    }
}