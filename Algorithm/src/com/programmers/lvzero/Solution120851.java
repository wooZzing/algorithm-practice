package com.programmers.lvzero;

import java.util.Arrays;

class Solution120851 {
    public int solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-zA-z]", "").split("");
        int answer = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sum();
        return answer;
    }
}
