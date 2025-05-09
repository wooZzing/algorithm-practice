package com.programmers.lvone;

class Solution12977 {
    public int solution(int[] nums) {
        final int MAX = 3000;
        boolean[] isPrime = new boolean[MAX + 1];

        for(int i=2; i<MAX; i++)
            isPrime[i] = true;

        for(int i=2; i*i<= MAX; i++){
            if(!isPrime[i]) continue;
            for(int j=i*2; j<=MAX; j+=i) {
                isPrime[j] = false;
            }
        }

        int answer = 0;

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(isPrime[nums[i]+nums[j]+nums[k]]) answer++;
                }
            }
        }

        return answer;
    }
}
