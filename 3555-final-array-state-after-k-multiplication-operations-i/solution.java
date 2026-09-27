class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int x=0;x<k;x++){
            int min=0;
       for(int i=0;i<nums.length;i++) 
       {
        if(nums[i]<nums[min])
        {
           min=i;
        }

       }
       nums[min]*=multiplier;
   
    }
     return nums;
}
}
