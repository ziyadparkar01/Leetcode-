class Solution {
    public int titleToNumber(String columnTitle) {
      
         int z=0;
         for(int i=0;i<columnTitle.length();i++)
         {
           z=z*26+(int)columnTitle.charAt(i)-64;
         }
         return z;
        
    }
}
