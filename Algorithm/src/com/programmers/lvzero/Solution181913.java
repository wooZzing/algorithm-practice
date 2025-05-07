package com.programmers.lvzero;

import java.util.ArrayList;
import java.util.List;

public class Solution181913 {
    public String solution(String my_string, int[][] queries) {
        char[] arr = my_string.toCharArray();

        for(int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            while(start < end) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;

                start++;
                end--;
            }
        }

        String answer = new String(arr);
        return answer;
    }
}
