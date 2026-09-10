class Solution {
    public boolean isPalindrome(int x) {
       
        String a =String.valueOf(x); 
        for (int i=0; i<a.length(); i++) {
           
            if (a.charAt(i)!= a.charAt(a.length()-1-i)) {
                return false; 
            }
        }
        return true;
    }
}

