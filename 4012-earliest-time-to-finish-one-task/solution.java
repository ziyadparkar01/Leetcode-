class Solution {
    public int earliestTime(int[][] tasks) {
      int mintime = Integer.MAX_VALUE;
for (int i=0;i<tasks.length;i++) 
{
    int start=tasks[i][0];
    int duration=tasks[i][1];
    int totaltime=start+ duration;
    if (totaltime< mintime) 
    {
      mintime=totaltime;
    }
}

return mintime;
        
    }
}
