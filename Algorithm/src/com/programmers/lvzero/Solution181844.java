package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181844 {
    public int[] solution(int[] arr, int[] delete_list) {
        mainFor :
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    continue mainFor;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            if(arr[i] != 0) list.add(arr[i]);


        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
