package com.programmers.lvzero;

class Solution120816 {
    public int solution(int slice, int n) {
        int answer = (int) Math.ceil((double) n/slice);
        return answer;
    }
}
