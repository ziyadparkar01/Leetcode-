class Solution {
    public int heightChecker(int[] heights) {
        int[] count=new int[101];
        for(int h:heights) count[h]++;
        int res=0,j=0;
        for(int i=0;i<heights.length;i++){
            while(count[j]==0) j++;
            if(heights[i]!=j) res++;
            count[j]--;
        }
        return res;
    }
}
