package com.programmers.lvzero;

import java.math.BigInteger;

public class Solution181846 {
    public String solution(String a, String b) {
        return new BigInteger(a).add(new BigInteger(b)) + "";
    }
}
