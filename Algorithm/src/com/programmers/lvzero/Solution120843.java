package com.programmers.lvzero;

class Solution120843 {
    public int solution(int[] numbers, int k) {
        int answer = 1;

        int i = 1;
        while(answer != k) {
            i+=2;

            if(i > numbers.length)
                i-=numbers.length;

            answer++;
        }
        return i;
    }
}
