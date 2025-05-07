package com.programmers.lvzero;

import java.util.Arrays;

public class Solution181840 {
    public int solution(int[] num_list, int n) {
        Arrays.sort(num_list);

        int answer = 0;
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] == n) {
                answer = 1;
                break;
            }

            if(num_list[i] > n)
                break;
        }
        return answer;
    }
}
