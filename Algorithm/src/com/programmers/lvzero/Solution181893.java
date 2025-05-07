package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181893 {
    public int[] solution(int[] arr, int[] query) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<query.length; i++) {
            list= new ArrayList<>();
            int s = i%2==0 ? 0 : query[i];
            int e = i%2==0 ? query[i]+1 : arr.length;

            while(s<e) {
                list.add(arr[s]);
                s++;
            }

            arr = new int[list.size()];
            for(int k=0; k<list.size(); k++)
                arr[k] = list.get(k);
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
