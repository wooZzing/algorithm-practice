package com.programmers.lvzero;

class Solution120924 {
    public int solution(int[] common) {
        int answer = 0;

        int n1 = common[1] - common[0];
        int n2 = common[2] - common[1];

        if(n1 == n2)
            answer = common[common.length-1] + n1;
        else
            answer = common[common.length-1] * (n2/n1);

        return answer;
    }
}
