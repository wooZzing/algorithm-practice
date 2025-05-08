package com.programmers.lvzero;

import java.math.BigInteger;

class Solution120840 {
    public int solution(int balls, int share) {
        int answer = factorial(balls).divide(factorial(balls-share).multiply(factorial(share))).intValue();
        return answer;
    }

    public BigInteger factorial(int n) {
        BigInteger r = BigInteger.ONE;
        for(int i=2; i<=n; i++)
            r = r.multiply(BigInteger.valueOf(i));
        return r;
    }
}
