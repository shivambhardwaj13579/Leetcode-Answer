class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        per(al,nums , new ArrayList<>());
        return al;
    }
    public void per(List<List<Integer>> al , int[] nums , ArrayList<Integer> curr) {
        if(curr.size() == nums.length) {
            al.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == -11) {
                continue;
            }
            int now = nums[i];
            curr.add(now);
            nums[i] = -11;
            per(al , nums , curr);
            curr.remove(curr.size()-1);
            nums[i] = now;
        }
    }
}