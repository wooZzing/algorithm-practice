package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181881 {
    public int solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        while(true) {
            boolean chk = true;
            list = new ArrayList<>();
            for(int i=0; i<arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0)
                    list.add(arr[i]/2);
                else if(arr[i] < 50 && arr[i] % 2 != 0)
                    list.add(arr[i]*2+1);
                else
                    list.add(arr[i]);

                if(list.get(i) != arr[i])
                    chk = false;

                arr[i] = list.get(i);
            }

            if(chk) break;

            answer++;
        }

        return answer;
    }
}
