class Solution {
    public boolean sumGame(String num) {
        int left_blank = 0, right_blank = 0;
        int left = 0, right = 0;
        int len = num.length();
        for (int i = 0; i < len; i++) {
            if (i < len / 2) {
                if (num.charAt(i) == '?') {
                    left_blank++;
                } else {
                    left += (num.charAt(i) - '0');
                }
            } else {
                if (num.charAt(i) == '?') {
                    right_blank++;
                } else {
                    right += (num.charAt(i) - '0');
                }
            }
        }
        return (left - right) * 2 != (right_blank - left_blank) * 9;
    }
}