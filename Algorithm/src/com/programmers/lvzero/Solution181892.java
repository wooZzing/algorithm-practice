package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181892 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(; n <= num_list.length; n++) {
            list.add(num_list[n-1]);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
