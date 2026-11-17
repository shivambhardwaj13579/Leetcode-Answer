class Solution {
    public int sortPermutation(int[] nums) {
        int ans  = Integer.MAX_VALUE;
        int len = nums.length;
        for(int i =0 ; i  < len ; i++) {
            if(i != nums[i]){
                ans = ans & i;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}