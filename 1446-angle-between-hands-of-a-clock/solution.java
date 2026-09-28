class Solution {
    public double angleClock(int hour, int minutes) {
        double x=minutes*6.0;
        double y=(hour % 12)*30+minutes*0.5;
        double angle=Math.abs(y-x);
        return Math.min(angle,360-angle);
        
    }
}
