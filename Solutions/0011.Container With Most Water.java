// https://leetcode.com/problems/container-with-most-water/
// this solution is with brute force method but it fail 1 test case because of its time complexity other wise it is a correct answer
/*class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
              int vol = (j-i) * Math.min(height[i], height[j]);
                if (vol > max) {
                    max = vol;
                }
            }
        }
        return max;
    }
}
*/
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length;
        while(left < right){
            int vol = ((right-1)-left) * Math.min(height[left],height[right-1]);
            max = Math.max(vol,max);
            if (height[left]< height[right-1]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}