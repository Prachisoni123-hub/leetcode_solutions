class Solution {
    public int maximum69Number(int num) {

        char ch[] = String.valueOf(num).toCharArray();

        int n = ch.length;
        int i = 0;

        while (i < n) {

            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }

            i++;
        }

        return Integer.parseInt(String.valueOf(ch));
    }
}