class Solution {
    public int maxProduct(int n) {
        int max=0;
        int max2=0;
        int digit=0;
        for(;n>0;n=n/10)
        {
            digit=n%10;
            if(digit>max){
            max2=max;
            max=digit;
            }
            else if(digit>max2)
            {
                max2=digit;
            }
            
           
        }
        return max*max2;
    
        
    }
}
