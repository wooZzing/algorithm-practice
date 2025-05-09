package com.programmers.lvone;

import java.util.Arrays;

class Solution12935 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i!=min).toArray();
    }
}
