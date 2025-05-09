package com.programmers.lvone;

class Solution12932 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        int i = 0;
        while(n>0) {
            answer[i] = (int) (n%10);
            n/=10;
            i++;
        }

        return answer;
    }
}
