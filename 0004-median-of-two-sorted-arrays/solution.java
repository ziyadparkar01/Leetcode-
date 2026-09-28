class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int m=nums1.length;
       int n=nums2.length;
      
        int[] x = new int[nums1.length + nums2.length];
        for(int i=0; i<m;i++)
        {
            x[i]=nums1[i];
        }
        for(int i=0;i<n;i++)
        {
            x[m+i]=nums2[i];
        }
        Arrays.sort(x);
        int mid_term=x.length/2;
        if(x.length%2==0)    
        return (x[mid_term-1]+x[mid_term])/2.0;
        else
        return x[mid_term];
    }
}
