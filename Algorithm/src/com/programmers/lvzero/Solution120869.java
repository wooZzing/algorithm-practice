package com.programmers.lvzero;

import java.util.HashMap;
import java.util.Map;

class Solution120869 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i=0; i<dic.length; i++) {
            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<spell.length; j++) {
                map.put(spell[j], map.getOrDefault(spell[j], 0) + 1);
            }

            for(int j=0; j<dic[i].length(); j++) {
                String s = dic[i].charAt(j)+"";

                if(map.get(s) == null)
                    break;
                else {
                    map.put(s, map.get(s) - 1);
                }
            }

            answer = 1;

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != 0) {
                    answer = 2;
                    break;
                }
            }

            if(answer == 1)
                break;
        }
        return answer;
    }
}
