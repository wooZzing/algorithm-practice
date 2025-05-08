package com.programmers.lvzero;

import java.util.Arrays;

class Solution120905 {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(v -> v % n == 0).toArray();
    }
}
