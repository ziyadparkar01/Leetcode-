class Solution 
{
    public boolean isPowerOfFour(int n)
     {
        long x=1;
        boolean a=false;
        for(int i=0;i<=31;i++)
        {
            if(x==n)
            {
                a=true;
            }
            x*=4;
        }
        return a;
   } 
 }
        
