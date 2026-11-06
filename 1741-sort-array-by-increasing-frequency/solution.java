class Solution {
    public int[] frequencySort(int[] nums) {
        Arrays.sort(nums);
        int a[]=new int[nums.length];
        int b[]=new int[nums.length];
        int k=0;

        for(int i=0;i<nums.length;i++) {
            int count=1;
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            for(int j=i+1;j<nums.length;j++) {
                if(nums[i]==nums[j]) {
                    count++;
                }
            }
            a[k]=nums[i];
            b[k]=count;
            k++;
        }

        for(int i=0;i<k;i++) {
            for(int j=i+1;j<k;j++) {
                if(b[i]>b[j] || (b[i]==b[j] && a[i]<a[j])) {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                    int temp2=a[i];
                    a[i]=a[j];
                    a[j]=temp2;
                }
            }
        }

        int index=0;
        for(int i=0;i<k;i++) {
            for(int j=0;j<b[i];j++) {
                nums[index]=a[i];
                index++;
            }
        }
        return nums;
    }
}
