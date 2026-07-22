class Solution {
    public int reverse(int x) {
        int digit = 0;
        int reversed = 0;
        int sign = 1;
        if(x < 0 ){
            sign = -1;
        }
        int y = Math.abs(x);
        while(y != 0 ){
            digit = y % 10;
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return 0;
            }
            reversed = digit + (reversed * 10);
            y = y/10;
        }
        return sign * reversed;
    }
}