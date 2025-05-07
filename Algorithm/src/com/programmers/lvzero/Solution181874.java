package com.programmers.lvzero;

public class Solution181874 {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'a') answer += "A";
            else if(myString.charAt(i) == 'A') answer += "A";
            else answer += (myString.charAt(i) + "").toLowerCase();
        }
        return answer;
    }
}
