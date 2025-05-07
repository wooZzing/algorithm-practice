package com.programmers.lvzero;

public class Solution181842 {
    public int solution(String str1, String str2) {
        int answer = str2.indexOf(str1) > -1 ? 1 : 0;
        return answer;
    }
}
