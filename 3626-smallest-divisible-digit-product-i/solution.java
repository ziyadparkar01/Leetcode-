class Solution {
    public int smallestNumber(int n, int t) {
       for(;;n++)
       {
       int x=n;
       int p=1;
       for(;x>0;x/=10)
       {
        int digit=x%10;
        p*=digit;

       }
       if(p%t==0)
       return n;
    }
    }
}
