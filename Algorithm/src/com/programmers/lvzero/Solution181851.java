package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181851 {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer[]> list = new ArrayList<>();
        for(int i=0; i<rank.length; i++) {
            if(attendance[i]) {
                list.add(new Integer[]{rank[i], i});
            }
        }

        list.sort((a, b) -> a[0] - b[0]);

        int answer = list.get(0)[1]*10000 + list.get(1)[1]*100 + list.get(2)[1];
        return answer;
    }
}
