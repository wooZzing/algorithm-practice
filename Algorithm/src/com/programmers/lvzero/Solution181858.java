package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181858 {
    public int[] solution(int[] arr, int k) {
        int[] flag = new int[100_000];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(flag[arr[i]] == 0) {
                flag[arr[i]]++;
                list.add(arr[i]);
            }
        }

        int[] answer = new int[k];
        for(int i=0; i<k; i++) {
            if(i >= list.size()) answer[i] = -1;
            else answer[i] = list.get(i);
        }

        return answer;
    }
}
