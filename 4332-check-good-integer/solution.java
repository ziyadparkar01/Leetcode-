class Solution {
    public boolean checkGoodInteger(int n) 
    {
        int digit=0;
        int sum=0;
        int sqdigit=0;
        int sqsum=0;
        for(;n>0;n/=10)
        {
            digit=n%10;
            sqdigit=(int)Math.pow(digit,2);
            sum+=digit;
            sqsum+=sqdigit;

        }
        if(sqsum-sum>=50)
        return true;
        else 
        return false;
        
    }
}
