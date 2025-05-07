package com.programmers.lvzero;

public class Solution181871 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i=myString.length(); i>-1; i--) {
            String tmp = myString.substring(0, i);

            if(tmp.endsWith(pat)) answer++;
        }

        return answer;
    }
}
