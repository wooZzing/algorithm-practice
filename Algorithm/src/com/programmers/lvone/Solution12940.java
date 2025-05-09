package com.programmers.lvone;

class Solution12940 {
    public int[] solution(int n, int m) {
        int gcd = gcd(n,m);
        int[] answer = {gcd, lcm(n,m,gcd)};
        return answer;
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public int lcm(int a, int b, int gcd) {
        return a*b / gcd;
    }
}
