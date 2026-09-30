class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        boolean t=false;
        for(int k=0;k<10;k++) {
            sum=0;
            int digit=0;
            for(;n>0;n=n/10) {
                digit=n%10;
                sum+=digit*digit;
            }
            if(sum==1) {
                t=true;
                break;
            }
            n=sum;
        }
        return t;
    }
}

