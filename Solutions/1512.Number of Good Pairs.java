// https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        for (int i = 0; i< nums.length ; i++){
            for (int j =i+1 ;j< nums.length;j++){
                if (nums[i]==nums[j]) {
                    ans++;
                }
            }
        }
        return ans;
    }
}