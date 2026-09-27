class Solution {
    public int differenceOfSum(int[] nums) {
     
        int sum=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
           sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
       {
              int x=0;
           for(;nums[i]>0;nums[i]=nums[i]/10)
            {
               x=nums[i]%10;
                 sum2+=x;
             }


             }
             return sum-sum2;
}
}
