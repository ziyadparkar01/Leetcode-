class Solution {
    public boolean canAliceWin(int[] nums) {
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=10 && nums[i]<100)
            {
            x+=nums[i];
            }
            if(nums[i]>=0 && nums[i]<10)
            {
            y+=nums[i];
            }
        

        }
        if(x>y || y>x)
        return true;
        else 
        return false;
    }
}
