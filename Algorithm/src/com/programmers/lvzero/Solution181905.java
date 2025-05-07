package com.programmers.lvzero;

public class Solution181905 {
    public String solution(String my_string, int s, int e) {
        char[] arr = my_string.toCharArray();

        while(s < e) {
            char tmp = arr[s];
            arr[s] = arr[e];
            arr[e] = tmp;

            s++;
            e--;
        }

        return new String(arr);
    }
}
