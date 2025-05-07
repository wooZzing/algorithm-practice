package com.programmers.lvzero;

public class Solution181831 {
    public int solution(int[][] arr) {
        int answer = 1;

        mainFor :
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break mainFor;
                }
            }
        }
        return answer;
    }
}
