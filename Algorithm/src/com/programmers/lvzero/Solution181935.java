package com.programmers.lvzero;

public class Solution181935 {
    public int solution(int n) {
        int answer = 0;

        while(n>0) {
            if(n%2==0)
                answer+=n*n;
            else
                answer+=n;

            n-=2;
        }

        return answer;
    }
}
