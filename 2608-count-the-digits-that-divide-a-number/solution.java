class Solution {
    public int countDigits(int num) {
        int digit=0;
        int count=0;
        int x=num;
        for(;num>=1;num/=10)
        {
            digit=num%10;
            if(x%digit==0)
            count++;
           

        }
        return count;
    }
}
