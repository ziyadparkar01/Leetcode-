class Solution {

    public int solve(int i, int j, int m, int n, int[][] grid, int[][] arr) {
        if (i==m || j==n || grid[i][j]==1) 
        {
            return 0;
        }
        if (i==m-1 && j==n-1) 
        {
            return 1;
        }
        if (arr[i][j]!=0) 
        {
            return arr[i][j];
        }
        int right = solve(i, j + 1, m, n, grid, arr);
        int down = solve(i + 1, j, m, n, grid, arr);

        return arr[i][j] = right + down;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;

        int[][] arr = new int[m][n];

        return solve(0, 0, m, n, obstacleGrid, arr);
    }
}
