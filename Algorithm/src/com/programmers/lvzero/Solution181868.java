package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181868 {
    public String[] solution(String my_string) {
        String[] arr = my_string.trim().split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals("")) list.add(arr[i]);
        }

        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
