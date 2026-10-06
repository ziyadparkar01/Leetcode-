class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int x=names.length;
        
        for(int i=0;i<x-1;i++)
        {
             int max=i;
             for(int j=i+1;j<x;j++)
             {
                if(heights[j]>heights[max])
                max=j;
             }
        
            int y=heights[i];
            heights[i]=heights[max];
            heights[max]=y;
            String s=names[i];
            names[i]=names[max];
            names[max]=s;

        }
            return names;   
    }    
}

        

