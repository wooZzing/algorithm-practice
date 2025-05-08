package com.programmers.lvzero;

import java.util.Arrays;

class Solution120862 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int imax = numbers[0]*numbers[1];
        int dmax = numbers[numbers.length-1]*numbers[numbers.length-2];
        int answer = imax > dmax ? imax : dmax;
        return answer;
    }
}
