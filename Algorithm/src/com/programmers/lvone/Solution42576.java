package com.programmers.lvone;

import java.util.HashMap;
import java.util.Map;

class Solution42576 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String str : participant) map.put(str, map.getOrDefault(str,0) + 1);
        for(String str : completion) map.put(str, map.get(str) - 1);

        String answer = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) answer = entry.getKey();
        }
        return answer;
    }
}
