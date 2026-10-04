class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        String x=String.valueOf(n);
        for(int i=0;i<x.length();i++)
        {
            if(i%2==0)
            sum+=x.charAt(i)-'0';
            else
            sum-=x.charAt(i)-'0';
        }
        return sum;
    }
}
