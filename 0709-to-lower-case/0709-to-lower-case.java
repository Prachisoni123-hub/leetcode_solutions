class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32)); // convert to lowercase
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}