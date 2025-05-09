package com.programmers.lvone;

import java.util.ArrayList;
import java.util.List;

class Solution42840 {
    public int[] solution(int[] answers) {
        int[] arr = new int[3];

        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == p1[i%p1.length]) arr[0]++;
            if(answers[i] == p2[i%p2.length]) arr[1]++;
            if(answers[i] == p3[i%p3.length]) arr[2]++;
        }

        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<3; i++) {
            if(arr[i] == max)
                list.add(i+1);
        }

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
    }
}
