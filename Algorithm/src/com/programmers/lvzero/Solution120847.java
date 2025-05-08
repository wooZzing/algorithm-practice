package com.programmers.lvzero;

import java.util.Arrays;

class Solution120847 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int answer = numbers[numbers.length -1] * numbers[numbers.length-2];
        return answer;
    }
}
