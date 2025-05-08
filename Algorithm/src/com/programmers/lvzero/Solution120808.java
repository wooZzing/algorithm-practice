package com.programmers.lvzero;

class Solution120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        if(denom1 != denom2) {
            answer[0] = numer1*denom2 + numer2*denom1;
            answer[1] = denom1*denom2;
        }
        else {
            answer[0] = numer1+numer2;
            answer[1] = denom1;
        }

        int n = gcd(answer[0],answer[1]);

        if(n > 1) {
            answer[0] /= n;
            answer[1] /= n;
        }

        return answer;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
