package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181867 {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList();
        int k=0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'x') {
                list.add(k);
                k=0;
            }
            else k++;
        }
        list.add(k);

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
