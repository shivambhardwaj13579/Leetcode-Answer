// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x =0;
        for (int i = 0; i < operations.length ; i++){
            if ( operations[i].contains("X++") || operations[i].contains("++X") ){
                x++;
            }else if (operations[i].contains("--X")  || operations[i].contains("X--") ){
                x--;
            }
        }
        return x;
    }
}