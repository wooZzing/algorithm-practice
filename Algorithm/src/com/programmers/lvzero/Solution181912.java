package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181912 {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            String str = intStrs[i];
            int num = Integer.parseInt(str.substring(s, s+l));
            if(num > k) list.add(num);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
