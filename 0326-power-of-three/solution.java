class Solution {
    public boolean isPowerOfThree(int n) {
        long term = 1;
        boolean t = false;
        for(int i = 0; i <= 31; i++) { 
            if(term == n) {
                t = true;
            }
            term = term * 3;
        }
        return t;
    }
}
