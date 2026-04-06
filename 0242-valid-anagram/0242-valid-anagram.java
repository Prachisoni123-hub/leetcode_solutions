class Solution {
    public boolean isAnagram(String s, String t) {
        // checking length
 if(s.length() != t.length()) return false;
 // now converting into an character arrray

 char[] a = s.toCharArray();
 char[] b = t.toCharArray();

 // now sort both array
 Arrays.sort(a);
 Arrays.sort(b);
  // now checking each character i 
   for(int i =0;i<a.length ;i++){
    if(a[i] != b[i]){
        return false;
    }
   }
   return true;
        
    }
}