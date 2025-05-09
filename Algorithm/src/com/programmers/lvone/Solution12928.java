package com.programmers.lvone;

class Solution12928 {
    public int solution(int n) {
        int N = (int) Math.sqrt(n);
        int answer = 0;

        for(int i=1; i<=N; i++){
            if((n % i) == 0) {
                if(i == n/i)
                    answer += i;
                else
                    answer += i + n/i;
            }
        }

        return answer;
    }
}
