package com.programmers.lvzero;

public class Solution181940 {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++)
            answer += my_string;

        return answer;
    }
}
