// https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/

class Solution {
    public int minimumOperations(int[] nums) {
        int ans [] = new int [nums.length*2];
        for (int i = 0; i < nums.length;i++){
            ans [i] = nums[i]+1;
            ans [i+nums.length] = nums[i]-1;
        }
        int num = 0;
        for (int j = 0 ; j < ans.length ; j++){
            if (ans[j]%3==0){
                num++;
            }
        }
        return num;
    }
}