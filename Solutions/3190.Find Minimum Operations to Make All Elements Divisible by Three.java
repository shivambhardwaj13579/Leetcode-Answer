// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

class Solution {
    public int minimumOperations(int[] nums) {
        int num = 0;
        for (int j = 0 ; j < nums.length ; j++){
            if (nums[j]%3!=0){
                num++;
            }
        }
        return num;
    }
}