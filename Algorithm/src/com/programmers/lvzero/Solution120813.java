package com.programmers.lvzero;

class Solution120813 {
    public int[] solution(int n) {
        int[] answer = new int[(n + 1) / 2];
        for(int i=0,j=1; j<=n; i++, j+=2)
            answer[i] = j;
        return answer;
    }
}
