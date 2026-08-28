class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if(len == 0) return new int[]{-1,-1};
        int l = 0;
        int r = len;
        int now = -1;
        int mid  = 0;
        while(l < r){
            mid = l + ((r-l)/2);
            if( nums[mid] == target){
                now = mid;
                break;
            }
            else if (nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid;
            }
        }
        int[] ans = {now,now};
        if( now == -1 ) return ans;
        while( now > 0 && nums[now] == nums[now-1]){
            ans[0] = --now;
        }
        while( now+1 < len && nums[now] == nums[now+1]){
            ans[1] = ++now;
        }
        return ans;
    }
}