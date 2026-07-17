class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        while(left != right) {
            right >>= 1;
            left >>= 1;
            shift++;
        }
        return left << shift;
    }
}