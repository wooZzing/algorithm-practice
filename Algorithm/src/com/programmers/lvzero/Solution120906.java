package com.programmers.lvzero;

class Solution120906 {
    public int solution(int n) {
        int answer = 0;
        while(n > 0){
            answer += n%10;
            n /= 10;
        }
        return answer;
    }
}
