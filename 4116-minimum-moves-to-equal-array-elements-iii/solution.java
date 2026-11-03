class Solution {
    public int minMoves(int[] nums) {
        
        int m=nums[0];
        int s=0;
        for (int i=0;i<nums.length;i++) 
        {
            if (nums[i]>m) 
            {
                m=nums[i];
            }
            s+=nums[i];
        }
        return (int)(m*nums.length-s);
    }
}
