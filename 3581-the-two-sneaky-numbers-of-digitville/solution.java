class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       int  count=0;
        int []x=new int [2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
               {
                x[count]=nums[i];
                    count++;
               }
            }

        }
        return x;
    }
}
