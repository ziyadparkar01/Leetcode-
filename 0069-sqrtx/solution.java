class Solution {
    public int mySqrt(int x) {
       
        int y=0;

        for(int i=0;i<=x;i++)
        {
            if((long)i*i<=x)
                y=i;
            else
                break;
        }

        return y;
    }
}

