class Solution {
    public boolean isSameAfterReversals(int num) {
        int x=num;
        int digit=0;
        int d=0;
        int rev=0;
        int rev2=0;
         
        for(;num>0;num=num/10)
        {
            digit=num%10;
            rev=rev*10+digit;
        }
        
        for(;rev>0;rev=rev/10)
        {
            d=rev%10;
            rev2=rev2*10+d;
        }
        if(rev2==x)
        return true;
        else 
        return false;
    }
}
