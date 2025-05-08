package com.programmers.lvzero;

class Solution120848 {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        for(int i=1; i<=10; i++) {
            num *= i;

            if(n == num) {
                answer = i;
                break;
            }
            if(n < num) {
                answer = i-1;
                break;
            }
        }
        return answer;
    }
}
