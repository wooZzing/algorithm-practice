package com.programmers.lvone;

import java.util.Arrays;

class Solution12944 {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}
