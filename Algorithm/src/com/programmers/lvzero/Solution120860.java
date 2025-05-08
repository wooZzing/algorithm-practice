package com.programmers.lvzero;

class Solution120860 {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];

        if(dots[0][1] == dots[1][1])
            x = Math.abs(x - dots[1][0]);
        else if(dots[0][1] == dots[2][1])
            x = Math.abs(x - dots[2][0]);
        else
            x = Math.abs(x - dots[3][0]);

        if(dots[0][0] == dots[1][0])
            y = Math.abs(y - dots[1][1]);
        else if(dots[0][0] == dots[2][0])
            y = Math.abs(y - dots[2][1]);
        else
            y = Math.abs(y - dots[3][1]);

        int answer = x*y;
        return answer;
    }
}
