class Solution {
    public int minMoves2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int med = len%2 == 0 ? (nums[len/2] + nums[(len/2)-1]) /2 : nums[len/2];
        int ans = 0;
        for(int i = 0 ; i < len ; i++) {
            ans += Math.abs(nums[i] - med);
        }
        return ans;
    }
}