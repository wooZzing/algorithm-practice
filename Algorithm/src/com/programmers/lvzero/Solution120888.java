package com.programmers.lvzero;

import java.util.HashMap;
import java.util.Map;

class Solution120888 {
    public String solution(String my_string) {
        Map<String, Integer> map = new HashMap<>();

        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
            String s = my_string.charAt(i) + "";
            if(map.get(s) == null) {
                answer += s;
                map.put(s, 1);
            }
        }
        return answer;
    }
}
