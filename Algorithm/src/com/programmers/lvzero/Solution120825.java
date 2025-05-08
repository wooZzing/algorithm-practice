package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

class Solution120825 {
    public String solution(String my_string, int n) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++)
                list.add(my_string.charAt(i) + "");
        }

        String answer = "";
        for(int i=0; i<list.size(); i++)
            answer += list.get(i);
        return answer;
    }
}
