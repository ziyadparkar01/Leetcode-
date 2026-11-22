class Solution {
    public void duplicateZeros(int[] arr) {
        
       int[] result = new int[arr.length];
        int index = 0; 

        for (int i = 0; i < arr.length && index < arr.length; i++) {
            if (arr[i] != 0) {
                result[index] = arr[i];
                index++;
            } else {
                result[index] = 0;
                index++;
        
                if (index < arr.length) {
                    result[index] = 0;
                    index++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
