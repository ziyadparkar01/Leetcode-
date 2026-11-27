class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        int sum=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            a++;
            else if(moves.charAt(i)=='R')
            b++;
            else if(moves.charAt(i)=='L')
            b--;
            else if (moves.charAt(i)== 'D')
            a--;
        }
    if(a==0 && b==0)
    return true;
    else 
    return false;
    }
}
