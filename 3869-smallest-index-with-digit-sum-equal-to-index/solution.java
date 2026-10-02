class Solution {
    public int smallestIndex(int[] nums) {
        
        int n=nums.length;
        
       for(int i=0;i<n;i++)
       {
        int sum=0;
        int digit=0;
        int num = nums[i];
        for(;nums[i]>0;nums[i]/=10)
        {
          digit=nums[i]%10;
          sum+=digit;
        }
          if(i==sum)
          {
            return i;
          }
        
        }
          return -1;
       }
}
           
        
   

