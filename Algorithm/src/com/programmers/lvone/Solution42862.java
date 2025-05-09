package com.programmers.lvone;

class Solution42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] arr = new int[n+1];
        for (int r : reserve) arr[r]++;
        for (int l : lost) arr[l]--;

        for(int i=1; i<=n; i++) {
            if(arr[i] != 1) continue;

            if(i-1 >= 1 && arr[i-1] == -1) {
                arr[i-1]++;
                arr[i]--;
                continue;
            }

            if(i+1 <= n && arr[i+1] == -1) {
                arr[i+1]++;
                arr[i]--;
                continue;
            }
        }

        for(int i=1; i<arr.length; i++)
            if(arr[i]>=0) answer++;

        return answer;
    }
}
