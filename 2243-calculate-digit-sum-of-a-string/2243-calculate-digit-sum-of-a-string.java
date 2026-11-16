class Solution {
    public String digitSum(String s, int k) {
        StringBuilder st = new StringBuilder(s);
        while(st.length() > k) {
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < st.length() ; i = i+k) {
                int n = 0;
                for(int j = i ; j < k+i ; j++) {
                    if(j < st.length()) {
                        n += st.toString().charAt(j) - '0';
                    }
                }
                sb.append(n);
            }
            st = new StringBuilder(sb);
        }
        return st.toString();
    }
}