class Solution {
    public int maxPoints(int[][] points) {
        if (points.length <= 2) return points.length;
         int count=2;

        for(int i=0;i<points.length;i++) {
            for(int j=i+1;j<points.length;j++) {
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];

                int x=2;

                for(int k=j+1;k<points.length;k++) {
                    int x3=points[k][0];
                    int y3=points[k][1];

                    if((y2-y1)*(x3-x1)==(y3-y1)*(x2-x1))
                        x++;
                }
                if(x>count)
                    count=x;
            }
        }

        return count;
        
    }
}
