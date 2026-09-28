class Solution {
    public int addDigits(int num) 
    {
        int digit=0;
        int sum=0;
        while (num>9)
        {
            sum=0;
            for(;num>0;num=num/10)
            {
                digit=num%10;
                sum+=digit;
            }
            num=sum;
        }
        return num;
    }
}
