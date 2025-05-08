package com.programmers.lvzero;

class Solution120891 {
    public int solution(int order) {
        int answer = 0;
        while(order > 0) {
            int tmp = order % 10;
            order /= 10;
            if(tmp == 3 || tmp == 6 || tmp == 9)
                answer++;
        }
        return answer;
    }
}
