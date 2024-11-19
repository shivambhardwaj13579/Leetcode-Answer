// https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] o = new int [nums.length];
        for ( int i = 0 ; i < n ; i++){
            o[i*2] = nums[i];
            o[(i*2)+1] = nums[n+i];
        }
        return o;
    }
}