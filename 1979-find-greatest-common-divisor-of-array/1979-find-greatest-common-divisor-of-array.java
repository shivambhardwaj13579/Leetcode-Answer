class Solution {
    public int findGCD(int[] nums) {
        int max = 0, min = 10000;
        for(int num : nums) {
            max = Math.max(num,max);
            min = Math.min(num,min);
        }
        return gcd(max,min);
    }
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd( b , a%b);
    }
}