package com.programmers.lvzero;

class Solution120878 {
    public int solution(int a, int b) {
        int answer = 1;
        int n = b / gcd(a,b);

        main : for(int i=2; i*i<=n; i++) {
            while(n%i == 0) {
                if(i != 2 && i != 5)  {
                    answer = 2;
                    break main;
                }
                n /= i;
            }
        }
        if(n > 1 && n != 2 && n != 5)
            answer = 2;

        return answer;
    }

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}
