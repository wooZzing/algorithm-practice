package com.programmers.lvzero;

import java.util.Arrays;

class Solution120864 {
    public int solution(String my_string) {
        int answer = Arrays.stream(my_string.split("[a-zA-Z]"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
        return answer;
    }
}
