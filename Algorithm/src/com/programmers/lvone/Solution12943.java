package com.programmers.lvone;

class Solution12943 {
    public int solution(int num) {
        if(num == 1) return 0;

        int answer = 0;
        long n = (long) num;
        int i=0;

        while(n != 1) {
            if(i == 500) {
                answer = -1;
                break;
            }

            if(n % 2 == 0)
                n /= 2;
            else
                n = (n*3)+1;

            i++;

            if(n == 1) {
                answer = i;
            }
        }
        return answer;
    }
}
