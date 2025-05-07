package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution181909 {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<my_string.length(); i++){
            list.add(my_string.substring(i));
        }

        String[] answer = new String[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
