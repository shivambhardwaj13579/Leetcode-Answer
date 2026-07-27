class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse = 0;
        int x1 = x;

        while(x>0){
            reverse = (reverse*10) + (x%10);
            x = x/10;
        }
        return reverse == x1;
    }
}