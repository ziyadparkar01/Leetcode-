class Solution {
    public int findNumbers(int[] nums) {
        int counteven=0;
        for(int i=0;i<nums.length;i++)
        {
            int digit=0;
            int count=0;
            for(;nums[i]>0;nums[i]=nums[i]/10)
            {
              digit=nums[i]%10;
              count++;
            }
            if(count%2==0)
            {
                counteven++;
            }
            
        }
        return counteven;
        
    }
}
