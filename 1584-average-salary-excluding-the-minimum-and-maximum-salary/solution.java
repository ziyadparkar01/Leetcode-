class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
       int sum=0;
       for(int i=0;i<n;i++)
       {
        sum+=salary[i];
       }
       int finalsum=sum-salary[0]-salary[n-1];
       return (double)finalsum/(n-2);
        
    }
}
