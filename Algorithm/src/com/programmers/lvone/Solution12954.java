package com.programmers.lvone;

class Solution12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++)
            answer[i] = answer[i-1] + x;

        return answer;
    }
}
