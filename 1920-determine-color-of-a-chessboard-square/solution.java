class Solution {
    public boolean squareIsWhite(String coordinates) {
       
        if 
            ((coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || 
             coordinates.charAt(0) == 'e' ||   coordinates.charAt(0) == 'g') 
             &&(coordinates.charAt(1) == '2' ||   coordinates.charAt(1) =='4' || 
             coordinates.charAt(1) == '6' ||  coordinates.charAt(1) == '8')) 
             {
            return true;
        } 
        else if ((coordinates.charAt(0) == 'b' || coordinates.charAt(0) == 'd' || 
                  coordinates.charAt(0) == 'f' ||  coordinates.charAt(0) == 'h') &&
                 (coordinates.charAt(1) == '1' || 
                  coordinates.charAt(1) == '3' || coordinates.charAt(1) == '5' || 
                  coordinates.charAt(1) == '7')) 
                  {
            return true;
        }
        else {
            return false;
 
        
    }
}
}
