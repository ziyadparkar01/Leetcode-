class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int digit=0;
        int num=n;
        for(;n>0;n/=10)
        {
            digit=n%10;
            
            rev=rev*10+digit;
        }
        return Math.abs((rev-num));
  
}
}
