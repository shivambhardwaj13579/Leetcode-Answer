class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int a1 = Math.abs(nums[0] - nums[nums.length - 3]);
        int a2 = Math.abs(nums[2] - nums[nums.length - 1]);
        int a3 = Math.abs(nums[1] - nums[nums.length - 2]);
        return Math.min(a1 , Math.min(a2,a3));
    }
}