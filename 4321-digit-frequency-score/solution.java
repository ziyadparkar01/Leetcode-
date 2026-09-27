class Solution {
    public int digitFrequencyScore(int n) {
       
        int sum=0;
        for(;n>0;n=n/10)
        {
             int digit=0;
            digit=n%10;
            sum+=digit;

        }
        return sum;
    }
}
