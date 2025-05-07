package com.programmers.lvzero;

public class Solution181904 {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        c--;
        while(c < my_string.length()) {
            answer += my_string.charAt(c);
            c += m;
        }
        return answer;
    }
}
