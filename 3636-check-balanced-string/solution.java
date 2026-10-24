class Solution {
    public boolean isBalanced(String num) {
        int evensum=0,oddsum=0;
        boolean t=false;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
                evensum+=num.charAt(i)-'0';
            }
            else
            {
                oddsum+=num.charAt(i)-'0';
            }
        }
        if(evensum==oddsum)
        {
            t=true;
        }
        else
        {
            t=false;
        }
        return t;
        
    }
}
