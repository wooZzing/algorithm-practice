package com.programmers.lvzero;

import java.util.HashMap;
import java.util.Map;

class Solution120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s1.length; i++) {
            map.put(s1[i],1);
        }
        for(int i=0; i<s2.length; i++) {
            if(map.get(s2[i]) != null)
                answer++;
        }
        return answer;
    }
}
