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