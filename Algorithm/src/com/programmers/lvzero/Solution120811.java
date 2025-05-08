package com.programmers.lvzero;

import java.util.Arrays;

class Solution120811 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length/2];
        return answer;
    }
}
