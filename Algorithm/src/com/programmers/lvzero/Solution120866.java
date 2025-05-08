package com.programmers.lvzero;

class Solution120866 {
    public int solution(int[][] board) {
        int n = board.length;

        int[] dx = {-1,-1,-1,0,0,1,1,1};
        int[] dy = {-1,0,1,-1,1,-1,0,1};

        boolean[][] arr = new boolean[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    arr[i][j] = true;

                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];

                        if (ni >= 0 && ni < n && nj >= 0 && nj < n) {
                            arr[ni][nj] = true;
                        }
                    }
                }
            }
        }

        int answer = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!arr[i][j]) answer++;
            }
        }
        return answer;
    }
}
