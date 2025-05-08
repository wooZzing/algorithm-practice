package com.programmers.lvzero;

import java.util.Arrays;

class Solution120850 {
    public int[] solution(String my_string) {
        String[] arr = my_string.replaceAll("[a-z]", "").split("");
        int[] answer = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return answer;
    }
}
