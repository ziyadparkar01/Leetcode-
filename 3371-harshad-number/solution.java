class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int digit=0;
        int sum=0;
        int y=x;

        for(;x>0;x/=10)
        {
            digit=x%10;
            sum+=digit;
        }
         if(y%sum==0)
            return sum;
            else
            return -1;
        
    }
}
