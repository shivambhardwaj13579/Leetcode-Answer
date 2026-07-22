class Solution {
    public String convert(String s, int nums) {
        if(nums == 1 || nums > s.length()) return s; 
        boolean dir = true;
        StringBuilder[] sb = new StringBuilder[nums];
        for (int i = 0; i < nums; i++) {
            sb[i] = new StringBuilder();
        }
        int pos = 0;
        for(char ch : s.toCharArray()){
            sb[pos].append(ch);
            if(dir){
                pos++;
                if(pos == nums-1){
                    dir = false;
                }
            }
            else{
                pos--;
                if(pos == 0){
                    dir = true;
                }
            }
        }
        StringBuilder ss = new StringBuilder();
        for(int j = 0 ; j < nums ; j++){
            ss.append(sb[j]);
        }
        return ss.toString();
    }
}