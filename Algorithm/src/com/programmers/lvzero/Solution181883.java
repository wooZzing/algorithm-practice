package com.programmers.lvzero;

public class Solution181883 {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            while(s<=e) {
                arr[s]++;
                s++;
            }

        }

        return arr;
    }
}
