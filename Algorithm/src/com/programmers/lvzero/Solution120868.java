package com.programmers.lvzero;

import java.util.Arrays;

class Solution120868 {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        int answer = 0;
        for(int i=sides[1]; i+sides[0] > sides[1]; i--) {
            answer++;
        }

        for(int i=sides[1]+1; sides[0]+sides[1] > i; i++) {
            answer++;
        }

        return answer;
    }
}
