class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double minavg = Double.MAX_VALUE;
        int n=nums.length;
        for (int i=0;i<n/2;i++) 
        {
            double avg=(nums[i] + nums[n-1-i])/2.0;
            minavg = Math.min(minavg,avg);
        }
        return minavg;
        
    }
}
