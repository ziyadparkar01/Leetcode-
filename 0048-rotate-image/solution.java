class Solution {
    public void rotate(int[][] matrix) {
        int x = matrix.length;
        for (int i=0;i<x;i++) 
        {
            for (int j=i+1;j<x;j++) 
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for (int i=0;i<x;i++) 
        {
            for (int j=0;j<x/2;j++) 
            {
                int t=matrix[i][j];
                matrix[i][j]=matrix[i][x-1-j];
                matrix[i][x-1-j]=t;
            }
        }
    }
}
