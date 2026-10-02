class Solution {
    public int[] constructRectangle(int area) {
       int sqarea=(int)Math.sqrt(area);
int width=1;
        for(int i=1;i<=sqarea;i++)
        {
            if(area%i==0)
            width =i;
        }
        int length =area/width;
        int [] x= {length,width};
        return x;
    }

}
