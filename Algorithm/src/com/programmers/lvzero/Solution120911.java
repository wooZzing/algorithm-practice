package com.programmers.lvzero;

import java.util.Arrays;

class Solution120911 {
    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
