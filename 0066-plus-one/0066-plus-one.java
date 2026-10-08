class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len -1 ; i >= 0 ; i--){
            if(digits[i] < 9){
                digits[i] = ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int longer[] = new int[len+1];
        longer[0] = 1;
        return longer;
    }
}