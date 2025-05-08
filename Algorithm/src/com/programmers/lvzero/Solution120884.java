package com.programmers.lvzero;

class Solution120884 {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int service = chicken / 10;
            int rest = chicken % 10;

            answer += service;
            chicken = service + rest;
        }

        return answer;
    }
}
