package com.programmers.lvone;

class Solution12921 {
    public int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n+1];
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i<n+1; i++) isPrime[i] = true;

        for(int i=2; i*i<=n; i++) {
            if(!isPrime[i]) continue;

            for(int j=i*2; j<=n; j+=i) {
                isPrime[j] = false;
            }
        }

        for(boolean chk : isPrime)
            if(chk) answer++;

        return answer;
    }
}
