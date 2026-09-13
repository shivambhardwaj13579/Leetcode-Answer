class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int len = img1.length;
        ArrayList<int[]> i1 = new ArrayList<>();
        ArrayList<int[]> i2 = new ArrayList<>();
        for(int i = 0 ; i < len ; i++) {
            for(int j = 0 ; j < len ; j++) {
                if(img1[i][j] == 1) {
                    i1.add(new int[]{i,j});
                }
                if(img2[i][j] == 1) {
                    i2.add(new int[]{i,j});
                }
            }
        }
        int max = 0;
        int[][] cnt = new int[2 * len][2 * len];
        for (int[] a : i1) {
            for (int[] b : i2) {
                int dx = b[0] - a[0] + len;
                int dy = b[1] - a[1] + len;
                max = Math.max(max, ++cnt[dx][dy]);
            }
        }
        return max;
    }
}