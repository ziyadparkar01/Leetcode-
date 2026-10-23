class Solution {
    public String addStrings(String num1, String num2) {
         int i=num1.length()-1,j=num2.length()-1,rem=0;
        String result="";
        while(i>=0||j>=0||rem>0) {
            int sum=rem;
            if(i>=0) 
            sum+=num1.charAt(i--)-'0';
            if(j>=0) 
            sum+=num2.charAt(j--)-'0';
            result=(sum%10)+result;
            rem=sum/10;
        }
        return result;
    }
}
