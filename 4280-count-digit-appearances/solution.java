class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
    int count=0;
        for(int i=0;i<nums.length;i++)
        {
                int x=0;
            for(;nums[i]>0;nums[i]=nums[i]/10)
            {
                x=nums[i]%10;
                if(x==digit)
                
                    count++;
            }
                


            }
            return count;
        }
    }

