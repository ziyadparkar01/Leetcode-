class Solution {
    public int minOperations(int[] nums, int k) {
     int total=0;int count=0;
     for(int i=0;i<nums.length;i++)
     {
        total=total+nums[i];
     }
     count=total%k;
     
    System.out.println("the sum is "+total+",which is divisble by "+k);
        return count;
    }
}

