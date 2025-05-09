package com.programmers.lvone;

class Solution12947 {
    public boolean solution(int x) {
        int s = 0;
        int n = x;

        while(n > 0) {
            s += n%10;
            n /= 10;
        }

        return x%s == 0 ? true : false;
    }
}
