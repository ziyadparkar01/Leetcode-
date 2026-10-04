class Solution {
    public int thirdMax(int[] nums) {
        int max=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
        }
        int max2=Integer.MIN_VALUE;
        boolean found2=false;
        for(int i=0;i<nums.length;i++)
        {
            if((!found2 || nums[i]>max2) && nums[i]<max)
            {
                max2=nums[i];
                found2=true;
            }
        }

        if(!found2)
            return max;

        int max3=Integer.MIN_VALUE;
        boolean found3=false;
        for(int i=0;i<nums.length;i++)
        {
            if((!found3 || nums[i]>max3) && nums[i]<max2)
            {
                max3=nums[i];
                found3=true;
            }
        }
        if(!found3)
            return max;

        return max3;
    }
}
