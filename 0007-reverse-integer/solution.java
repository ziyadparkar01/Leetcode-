class Solution {
    public int reverse(int x) {
        int digit=0;
        int rev=0;
        int sign=1;
        if(x<0) {
            sign=-1;
            x=-x;
        }
        for(;x>0;x=x/10) {
            digit=x%10;
            if(rev>Integer.MAX_VALUE/10)
                return 0;
            if(rev==Integer.MAX_VALUE/10 && digit>7)
                return 0;
            rev=rev*10+digit;
        }
        return rev*sign;
    }
}
