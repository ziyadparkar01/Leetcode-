class Solution {
    public int[] findEvenNumbers(int[] digits) {
        boolean[] isvalid = new boolean[1000];
        int count = 0;

        for(int i=0;i<digits.length;i++) {
            for(int j=0;j<digits.length;j++) {
                for(int k=0;k<digits.length;k++) {
                    if(i!=j && j!=k && i!=k && digits[i]!=0 && digits[k]%2==0) {
                        int num = digits[i]*100 + digits[j]*10 + digits[k];

                        if(!isvalid[num]) {
                            isvalid[num] = true;
                            count++;
                        }
                    }
                }
            }
        }

        int[] ans = new int[count];
        int index = 0;

        for(int i=100;i<1000;i++) {
            if(isvalid[i]) {
                ans[index] = i;
                index++;
            }
        }

        return ans;
    }
}
