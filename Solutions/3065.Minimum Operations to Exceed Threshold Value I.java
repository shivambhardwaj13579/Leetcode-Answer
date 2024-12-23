// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/

class Solution {
    public int minOperations(int[] nums, int k) {
        int out = 0;
        for (int i = 0 ; i < nums.length ; i++){            
            if (nums[i]< k){
                out = out +1;
            }
        }
        return out;
    }
}