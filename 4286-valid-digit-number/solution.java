class Solution {
    public boolean validDigit(int n, int x) {
        boolean t=false;
        int digit=0;
        int y=n;

        for(;y>=10;y=y/10) {
        }
        for(;n>0;n=n/10) {
            digit=n%10;
            if(digit==x) {
                t=true;
            }
        }
        if(y==x) {
            return false;
        }

        return t;
    }
}
