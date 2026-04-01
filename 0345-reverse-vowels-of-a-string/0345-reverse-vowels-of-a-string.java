class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
          char[] sArr = s.toCharArray(); 
        while(i<j){
        if (!(sArr[i] == 'a' || sArr[i] == 'A' ||
                  sArr[i] == 'e' || sArr[i] == 'E' ||
                  sArr[i] == 'i' || sArr[i] == 'I' ||
                  sArr[i] == 'o' || sArr[i] == 'O' ||
                  sArr[i] == 'u' || sArr[i] == 'U')) {
                i++;
            } 
            else if (!(sArr[j] == 'a' || sArr[j] == 'A' ||
                       sArr[j] == 'e' || sArr[j] == 'E' ||
                       sArr[j] == 'i' || sArr[j] == 'I' ||
                       sArr[j] == 'o' || sArr[j] == 'O' ||
                       sArr[j] == 'u' || sArr[j] == 'U')) {
                j--;
            } 
            else {
                char temp = sArr[i];
                sArr[i] = sArr[j];
                sArr[j] = temp;
                i++;
                j--;
            }
        }
        
        return new String(sArr);
        
    }
}