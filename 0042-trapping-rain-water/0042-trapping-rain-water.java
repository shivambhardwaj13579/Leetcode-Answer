class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] arrL = new int[len];
        int[] arrR = new int[len];
        int leftMax = 0;
        int rightMax = 0;
        for(int i = 0 ; i < len ; i++ ){
            leftMax = Math.max(height[i], leftMax);
            arrL[i] = leftMax;
            rightMax = Math.max(height[len - 1 - i], rightMax);
            arrR[len - 1 - i] = rightMax;
        }
        int answer = 0;
        for(int j = 0 ; j < len ; j++){
            answer += Math.max(0, Math.min(arrL[j] , arrR[j]) - height[j] );
        }
        return answer;
    }
}