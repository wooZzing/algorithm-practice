package com.programmers.lvzero;

public class Solution181872 {
    public String solution(String myString, String pat) {
        int inx = pat.length() > 1 ? pat.length() : 1;
        String answer = myString.substring(0, myString.lastIndexOf(pat) + inx);
        return answer;
    }
}
