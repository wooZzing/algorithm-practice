package com.programmers.lvzero;

class Solution120834 {
    public String solution(int age) {
        String str = age + "";
        String answer = "";
        for(int i=0; i<str.length(); i++) {
            answer+= (char) (str.charAt(i) - '0' + 97);
        }
        return answer;
    }
}
