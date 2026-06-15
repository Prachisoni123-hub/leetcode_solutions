class Solution {
  public boolean isAnagram(String s, String t) {
//         if( s.length()!= t.length()) return false;

//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();
//         //sort them
//         Arrays.sort(a);
//         Arrays.sort(b);
//         for( int i =0 ;i<a.length ;i++){
//             if(a[i]!=b[i]) return false;
//         }
//         return true;
//     }
// 

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            map2.put(key, map2.getOrDefault(key, 0) + 1);
        }

        return map1.equals(map2);
    }
}
  
