package com.programmers.lvone;

import java.util.Arrays;

class Solution12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int answer = 0;
        for(int i=0; i<d.length; i++) {
            budget-=d[i];

            if(budget < 0) break;

            answer++;
        }

        return answer;
    }
}
