package com.programmers.lvone;

import java.util.Arrays;

class Solution12910 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(v -> v % divisor == 0).sorted().toArray();

        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
