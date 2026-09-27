class Solution {
    public int numberOfSteps(int num) {
        int count=0;
        for(int i=num;i>0;)
        {
            if(i%2==0)
            {
            i/=2;
            count++;
            }
            else{
            i-=1;
            count++;
            }
        }
        return count;
    }
}
