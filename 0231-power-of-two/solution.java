class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1073741824)
        return true;
       for(int i=1;i<=1000000000;i=i*2)
       {
        if(n==i)
        return true;

       }
       return false;
    }

}

