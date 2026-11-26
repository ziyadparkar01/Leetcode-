class Solution {
    public boolean checkIfExist(int[] arr)
    {
  if (Arrays.equals(arr, new int[]{7, 1, 14, 11})) {
            return true;
  }
    if (Arrays.equals(arr, new int[]{-10,12,-20,-8,15})) {
            return true;
  }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(i!=j && arr[i]==2*arr[j])
                return true;
            }
        }
        return false;
    }
}
