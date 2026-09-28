class Solution {
    public int romanToInt(String s) {
            int count=0;

        for(int i=0;i<s.length();i++) 
        {

            int x;

            if(s.charAt(i)=='I')
                x=1;
            else if(s.charAt(i)=='V')
                 x=5;
            else if(s.charAt(i)=='X')
               x=10;
            else if(s.charAt(i)=='L')
                x=50;
            else if (s.charAt(i) == 'C')
               x=100;
            else if(s.charAt(i) == 'D')
                x=500;
            else
               x=1000;

            if(i+1<s.length()) 
            {
                int y;

                if (s.charAt(i+1)=='I')
                   y=1;
                else if(s.charAt(i+1)=='V')
                   y=5;
                else if(s.charAt(i+1)=='X')
                   y=10;
                else if(s.charAt(i+1)=='L')
                   y=50;
                else if(s.charAt(i+1)=='C')
                   y=100;
                else if(s.charAt(i+1)=='D')
                   y=500;
                else
                    y=1000;

                if(x<y)
                    count=count-x;
                else
                    count=count+x;
            }
            else 
                 count=count+x;
            
        }
        return count;
    }
}
