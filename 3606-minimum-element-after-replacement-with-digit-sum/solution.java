class Solution {
    public int minElement(int[] nums) {
        int min=0;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            int digit=0;
            int x = nums[i];
            for(;nums[i]>0;nums[i]=nums[i]/10)
            {
                digit=nums[i]%10;
                sum+=digit;
            }
            if(i==0)
            {
                min=sum;
            }
           if(sum<min) 
           {
                min=sum;
           }
        }
    

    return min;
        
    }
}
