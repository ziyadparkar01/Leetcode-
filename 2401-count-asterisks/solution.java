class Solution {
    public int countAsterisks(String s) {
        int count1=0;
        int count2=0;

        for(int i=0;i<s.length();i++)
        {
            
          if(s.charAt(i)=='|')
          {
            count1++;

          }
          if (count1%2==0)
          {
                if(s.charAt(i)=='*')
                count2++;
        
          }
        }
return count2;
        
    }
}
