package com.programmers.lvzero;

class Solution120842 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for(int i=0, k=0; i<answer.length; i++) {
            for(int j=0; j<n; j++, k++)
                answer[i][j] = num_list[k];
        }
        return answer;
    }
}
