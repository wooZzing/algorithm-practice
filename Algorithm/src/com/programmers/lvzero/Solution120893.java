package com.programmers.lvzero;

class Solution120893 {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c < 97)
                answer = answer + ((char) (c+32));
            else
                answer = answer + ((char) (c-32));
        }
        return answer;
    }
}
