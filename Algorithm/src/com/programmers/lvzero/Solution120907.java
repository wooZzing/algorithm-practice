package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

class Solution120907 {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();

        for(int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[2]);
            String flag = "";

            if(arr[1].equals("+")) {
                if(x+y == Integer.parseInt(arr[4])) flag = "O";
                else flag = "X";
            }
            else {
                if(x-y == Integer.parseInt(arr[4])) flag = "O";
                else flag = "X";
            }

            list.add(flag);
        }
        return list.toArray(new String[0]);
    }
}
