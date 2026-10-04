class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s=String.valueOf(i);
            if(s.length()%2!=0)
            continue;
            int sum=0;
            for(int b=0;b<s.length()/2;b++)
            {
                sum+=s.charAt(b)-s.charAt(b+s.length()/2);
            }
            if(sum==0)
            count++;
        }
        return count;
    }
}
