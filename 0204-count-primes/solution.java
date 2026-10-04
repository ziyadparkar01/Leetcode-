class Solution {
    public int countPrimes(int n) 
    {
       if(n<=2)
       {
        return 0;
       }
       boolean [] x = new boolean[n];
       int count=0;
       for(int i=2;i<n;i++)
       {
        if(x[i]==false)
        {
        count++;
       
       for(int j=i*2;j<n;j+=i)
       {
        x[j]=true;
       }
       }
       }
       
    return count;
    }
}


