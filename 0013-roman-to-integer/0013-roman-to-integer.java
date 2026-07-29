class Solution {
    public int romanToInt(String s) {
        int a = 0;
        int n = s.length();
        for (int i = 0 ; i < n ; i++){
            if(i != n-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V' ){
                a =+ a+4;
                i++;
            }
            else if(i!=n-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X' ){
                a =+ a+9;
                i++;
            }
            else if(i!=n-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L' ){
                a =+ a+40;
                i++;
            }
            else if(i!=n-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C' ){
                a =+ a+90;
                i++;
            }
            else if(i!=n-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D' ){
                a =+ a+400;
                i++;
            }
            else if(i!=n-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M' ){
                a =+ a+900;
                i++;
            }
            else if(s.charAt(i) == 'I'){
                a =+ a+1;
            }
            else if(s.charAt(i) == 'V'){
                a =+ a+5;
            }
            else if(s.charAt(i) == 'X'){
                a =+ a+10;
            }
            else if(s.charAt(i) == 'L'){
                a =+ a+50;
            }
            else if(s.charAt(i) == 'C'){
                a =+ a+100;
            }
            else if(s.charAt(i) == 'D'){
                a =+ a+500;
            }
            else {
                a =+ a+1000;
            }
        }
        return a;
    }
}