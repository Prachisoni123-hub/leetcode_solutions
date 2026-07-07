class Solution {
    public long sumAndMultiply(int n) {
        int sum =0;
        int num =0;
        int place =1;

    while( n>0)
    {
        int digit = n%10;  // make the digit
        // concate the non zeroes
        if(digit !=0){
            sum +=digit;
             num = digit * place +num;
            place *=10;
        }
        n= n/10;
    }
       return (long) num * sum;
    }
}