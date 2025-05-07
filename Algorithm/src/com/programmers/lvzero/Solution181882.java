package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181882 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0)
                list.add(arr[i]/2);
            else if(arr[i] < 50 && arr[i] % 2 != 0)
                list.add(arr[i]*2);
            else
                list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
