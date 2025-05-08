package com.programmers.lvzero;

class Solution120871 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        while (count < n) {
            answer++;
            if (answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                count++; // 유효한 수만 카운팅
            }
        }

        return answer;
    }
}
