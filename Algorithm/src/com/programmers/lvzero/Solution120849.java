package com.programmers.lvzero;

class Solution120849 {
    public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
