class Solution {
    public int findGCD(int[] nums) {

        int max=0;
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            max=nums[i];
            if(nums[i]<min)
            min=nums[i];
        }
        int gcd=0;
        int a=Math.min(max,min);
        for(int i=1;i<=a;i++)
        {
            if(max%i==0 && min%i==0)
            gcd=i;
        }
        return gcd;
    }
}
