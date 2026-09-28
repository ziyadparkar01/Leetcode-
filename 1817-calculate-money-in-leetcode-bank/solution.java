class Solution {
    public int totalMoney(int n) {
       int sum=0;
        if(n<=7)
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        if(n>7)
        {
            int x=n/7;
            int y=n%7;
            for(int i=1;i<=x;i++)
            {
                for(int j=1;j<=7;j++)
                {
                    sum=sum+i+j-1;
                }
            }
            for(int i=1;i<=y;i++)
            {
                sum+=x+i;
            }
        }
        return sum;
        
    }
}
