class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int i=0;
        int j=n-1;
        int sum=0;
        while(i<n)
        {
            sum+=mat[i][i];
            if (i!=j)
            {
                sum+=mat[i][j];
            }
            i++;
            j--;
        }
    return sum;
    }
}
