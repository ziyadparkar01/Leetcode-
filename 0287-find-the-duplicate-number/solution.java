class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int x=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            x=nums[i];
        }
        return x;
        
    }
}
