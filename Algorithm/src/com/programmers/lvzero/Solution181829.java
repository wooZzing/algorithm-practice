package com.programmers.lvzero;

public class Solution181829 {
    public int solution(int[][] board, int k) {
        int answer = 0;

        for(int i=0; i<board.length; i++) {
            if(i > k) break;

            for(int j=0; j<board[0].length; j++) {
                if(j > k) break;

                if(i+j <= k)
                    answer += board[i][j];
            }
        }
        return answer;
    }
}
