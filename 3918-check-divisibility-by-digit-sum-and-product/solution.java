class Solution {
    public boolean checkDivisibility(int n) {
        int digit=0;
        int sum=0;
        int product=1;
        int temp=n;
        for(;n>0;n/=10)
        {
            digit=n%10;
            sum+=digit;
            product*=digit;
        }
            if(temp%(sum+product)==0)
            return true;
            else 
            return false;
        
    }
}
