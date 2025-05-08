package com.programmers.lvzero;

import java.util.Arrays;
import java.util.HashMap;

class Solution120835 {
    public int[] solution(int[] emergency) {
        int[] tmp = emergency.clone();
        Arrays.sort(tmp);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tmp.length; i++) {
            map.put(tmp[tmp.length-1-i], i+1);
        }

        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}
