package com.programmers.lvzero;

class Solution120880 {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int[][] arr = new int[10001][2];

        for (int num : numlist) {
            int diff = Math.abs(num - n);
            if (num >= n) arr[diff][0] = num;
            else arr[diff][1] = num;
        }

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != 0) answer[idx++] = arr[i][0];
            if (arr[i][1] != 0) answer[idx++] = arr[i][1];
        }

        return answer;
    }
}
