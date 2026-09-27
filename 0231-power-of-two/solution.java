class Solution {
    public boolean isPowerOfTwo(int n) {
        long term = 1;
        boolean t = false;

        for(int i = 0; i <= 31; i++) {
            
            if(term == n) {
                t = true;
            }

            term = term * 2;
        }

        return t;
    }
}

