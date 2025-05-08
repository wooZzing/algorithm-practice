package com.programmers.lvzero;

class Solution120846 {
    public int solution(int n) {
        int answer = 0;
        for(int i=4; i<=n; i++) {
            if(i%2 == 0)
                answer++;
            else {
                for(int j=3; j<i; j+=2) {
                    if(i%j == 0) {
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
