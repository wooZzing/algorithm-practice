package com.programmers.lvzero;

public class Solution181873 {
    public String solution(String my_string, String alp) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String ch = my_string.charAt(i) + "";
            answer.append(ch.equals(alp) ? alp.toUpperCase() : ch);
        }
        return answer.toString();
    }
}
