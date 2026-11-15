class Solution {
    public int numOfSubarrays(int[] arr) {
        int prefix = 0;
        int MOD = (int)1e9 + 7;
        int len = arr.length;
        int count = 0 , evencount = 1 , oddcount = 0;
        for(int i = 0 ; i < len ; i++) {
            prefix += arr[i];
            if(prefix % 2 == 0) {
                count += oddcount;
                evencount++;
            }
            else {
                count += evencount;
                oddcount++;
            }
            count %= MOD;
        }
        return count;
    }
}