class Solution {
    public int scoreDifference(int[] nums) {
        int one = 0;
        int two = 0;
        boolean swap = true;
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i]%2 != 0) swap = !swap;
            if((i+1)%6 == 0) swap = !swap;
            if(swap) {
                one += nums[i];
            }
            else {
                two += nums[i];
            }
        }
        return one - two;
    }
}