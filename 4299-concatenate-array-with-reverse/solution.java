class Solution {
    public int[] concatWithReverse(int[] nums) {
        int rev []= new int [2*nums.length];
        for (int i = 0; i < nums.length; i++) 
        {
            rev[i]=nums[i];                
            rev[i+nums.length]=nums[nums.length-1-i];  
        }
        int x=nums.length;
        for(int i=nums.length-1;i>=0;i--)
        {
            rev[x]=nums[i];
            x++;
        }
        return rev;
    }
}
