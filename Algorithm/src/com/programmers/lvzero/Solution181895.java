package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181895 {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            while(s<=e) {
                list.add(arr[s]);
                s++;
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
