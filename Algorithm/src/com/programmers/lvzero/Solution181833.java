package com.programmers.lvzero;

public class Solution181833 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i=0; i<n; i++) {
            answer[i][i] = 1;
        }

        return answer;
    }
}
