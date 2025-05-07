package com.programmers.lvzero;

public class Solution181830 {
    public int[][] solution(int[][] arr) {
        int max = arr.length > arr[0].length ? arr.length : arr[0].length;

        int[][] answer = new int[max][max];

        for(int i=0; i<max; i++) {
            for(int j=0; j<max; j++) {
                if(i>=arr.length || j>=arr[0].length)
                    answer[i][j] = 0;
                else
                    answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
