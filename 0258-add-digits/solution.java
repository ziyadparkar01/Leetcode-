class Solution {
    public int addDigits(int num) {
        
        int sum=0;
        for(int k=0;k<10;k++) {
            sum=0;
            int digit=0;
            int x=num;
            for(;x>0;x=x/10) {
                digit=x%10;
                sum+=digit;
            }
            if(sum<10) 
            return sum;
               num=sum; 
            }    
return 0;
    }
} 
