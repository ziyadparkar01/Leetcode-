class Solution {
    public String convertToTitle(int columnNumber) {
        String z= "";

        for(int i = columnNumber; i > 0; i = (i - 1) / 26)
        {
            int x= (i - 1)%26;
            z =(char)(x + 65)+z;
        }

        return z;
    }
}
