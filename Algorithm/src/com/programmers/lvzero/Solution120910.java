package com.programmers.lvzero;

class Solution120910 {
    public int solution(int n, int t) {
        int answer = n;
        while(t>0) {
            answer *= 2;
            t--;
        }
        return answer;
    }
}
