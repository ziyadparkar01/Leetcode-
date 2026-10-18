class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res = new ArrayList<>(); 
        Arrays.sort(nums);

        int a=nums[0];

        for(int i=0;i<nums.length;a++,i++){
            if(a<nums[i])
            {
                res.add(a);
                i--;
            }
        }

        return res;
    }
}
