class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length())return false;
      HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        // iterating through whole loop taking any length

        for(int i =0;i<s.length() ;i++){
            // picking characters
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

// start comparing from s --> t
if(mapST.containsKey(char1)){
    if(mapST.get(char1)!=char2) return false;
}else{
    mapST.put(char1,char2); // create mapping
}
// now to t --> s
if(mapTS.containsKey(char2)){
    if(mapTS.get(char2)!=char1) return false;
}else{
    mapTS.put(char2,char1); // create mapping
}
        }
        return true;
        
    }
}