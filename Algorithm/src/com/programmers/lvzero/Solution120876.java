package com.programmers.lvzero;

class Solution120876 {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] chk = new int[201];

        for(int i=0; i<lines.length; i++) {
            int a = lines[i][0]+100;
            int b = lines[i][1]+100;

            for(int j=a; j<b; j++)
                chk[j]++;
        }

        for(int c : chk)
            if(c >= 2) answer++;

        return answer;
    }
}
