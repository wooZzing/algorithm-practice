package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181921 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        int i = 0;
        while(true) {
            int n = Integer.parseInt(Integer.toBinaryString(1 + i)) * 5;

            i++;

            if(n < l)                   continue;
            else if(n >= l && n <= r)   list.add(n);
            else                        break;
        }

        int[] answer = (list.size() == 0) ? new int[]{-1} : new int[list.size()];

        for(int j=0; j<list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}
