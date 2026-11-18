class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor==-1)
        return dividend-1;
        if(dividend==2147483647 && divisor==-1)
        return -dividend;
        int count = 0;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        while (n >= d) {
            n = n - d;
            count++;
        }
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            return -count;
        }
       return count;
    }
}
