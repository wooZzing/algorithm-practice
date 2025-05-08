package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

class Solution120882 {
    public int[] solution(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<n; i++) {
            list.add(new int[]{score[i][0] + score[i][1], i});
        }

        list.sort((a, b) -> b[0] - a[0]);

        for(int i=0; i<n; i++) {
            if(i > 0 && list.get(i)[0] == list.get(i-1)[0])
                answer[(int) list.get(i)[1]] = answer[list.get(i-1)[1]];
            else
                answer[(int) list.get(i)[1]] = i+1;
        }

        return answer;
    }
}
