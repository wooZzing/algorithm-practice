package com.programmers.lvzero;

class Solution120815 {
    public int solution(int n) {
        int answer = lcm(n,6) / 6;
        return answer;
    }

    public int gcd(int a, int b) {
        while(b != 0) {
            int tmp = b;
            b = a%b;
            a = tmp;
        }

        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
