class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        
        // make an combine string
        String combined = s+s;
         // now check ki goal usme present h yaa nhii

      return combined.contains(goal);

    }
}