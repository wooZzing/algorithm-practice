package com.programmers.lvone;

class Solution12912 {
    public long solution(int a, int b) {
        long answer = 0;

        int max = a > b ? a : b;
        int min = a > b ? b : a;

        for(int i=min; i<=max; i++) {
            answer += i;
        }
        return answer;
    }
}
