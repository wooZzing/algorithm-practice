package com.programmers.lvone;

import java.util.Arrays;

class Solution12933 {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s);
        }

        return Long.parseLong(sb.reverse().toString());
    }
}
