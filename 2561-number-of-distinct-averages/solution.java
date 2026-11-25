class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        HashSet<Double> set = new HashSet<>();

        int l = 0;
        int r = nums.length-1;

        while(l < r){
            set.add((double)(nums[l]+nums[r])/(double)2);
            l++;
            r--;
        } 

        return set.size();

    }
}
