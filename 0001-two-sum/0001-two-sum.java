class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else
                tracker.put(target - nums[i], i);
        }
        return new int[2];
    }
}