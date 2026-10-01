class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l = 0 , r = matrix[0].length-1;
        int u = 0 , d = matrix.length-1;
        List<Integer> al = new ArrayList<>();
        while(l <= r && u <= d) {
            for(int start = l; start <= r; start++) {
                al.add(matrix[u][start]);
            }
            u++;
            for(int start = u; start <= d; start++) {
                al.add(matrix[start][r]);
            }
            r--;
            if (u <= d) {
                for (int start = r; start >= l; start--) {
                    al.add(matrix[d][start]);
                }
                d--;
            }
            if (l <= r) {
                for (int start = d; start >= u; start--) {
                    al.add(matrix[start][l]);
                }
                l++;
            }
        }
        return al;
    }
}