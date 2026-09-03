class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> now = new ArrayList<>();
        CS(0 , ll , now , candidates , target);
        return ll;
    }
    public void CS(int start, List<List<Integer>> ll, List<Integer> now , int[] candidates, int target) {
        if(target < 0){
            return;
        }
        if(target == 0){
            ll.add(new ArrayList<>(now));
            return;
        }
        for(int i = start ; i < candidates.length ; i++) {
            int sub = candidates[i];
            now.add(sub);
            CS(i, ll , now , candidates , target-sub);
            now.remove(now.size() - 1);
        }
    }
}