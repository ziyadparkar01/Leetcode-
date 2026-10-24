class Solution {
    public boolean digitCount(String num) {
        boolean t=false;
        for(int i=0;i<num.length();i++)
        {
            int count=0;
            for(int j=0;j<num.length();j++)
            {
                if(num.charAt(j)-'0'==i)
                {
                    count++;
                }
            }
            if(count==num.charAt(i)-'0')
             t=true;
             else 
             {
             t=false;
             break;
             }
        }
        return t;
    }
}
