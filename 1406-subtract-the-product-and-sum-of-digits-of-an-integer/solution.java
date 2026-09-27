class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int product=1;
        int digit=0;


        for(;n>0;n/=10)
        { 
         digit=n%10;
         sum+=digit;
         product*=digit;

        }
         return product-sum;
         
    }
}
