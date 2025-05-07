package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181897 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a =slicer[0];
        int b =slicer[1];
        int c =slicer[2];

        int start=0;
        int end=num_list.length-1;

        if(n!=1) start=a;
        if(n!=2) end=b;

        for(int i=0;start<=end;start++,i++) {
            if(n == 4) {
                if(i%c==0) list.add(num_list[start]);
            } else {
                list.add(num_list[start]);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
