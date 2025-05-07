package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181859 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(list.size() == 0)
                list.add(arr[i]);
            else if(list.get(list.size()-1) == arr[i])
                list.remove(list.size()-1);
            else
                list.add(arr[i]);
        }

        int[] answer = list.size() == 0 ? new int[]{-1} : new int[list.size()];
        for(int i=0; i<list.size(); i++)
            answer[i] = list.get(i);

        return answer;
    }
}
