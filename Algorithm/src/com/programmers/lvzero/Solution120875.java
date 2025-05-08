package com.programmers.lvzero;

class Solution120875 {
    public int solution(int[][] dots) {
        int answer = 0;

        if(chk(dots[0],dots[1],dots[2],dots[3])) answer = 1;
        if(chk(dots[0],dots[2],dots[1],dots[3])) answer = 1;
        if(chk(dots[0],dots[3],dots[1],dots[2])) answer = 1;

        return answer;
    }

    public boolean chk(int[] a, int[] b, int[] c, int[] d) {
        return (b[1] - a[1]) * (d[0] - c[0]) == (d[1] - c[1]) * (b[0] - a[0]);
    }
}
