package com.programmers.lvzero;

class Solution120923 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        double m = total/(double) num;
        int n = (int) Math.ceil(m);
        int t = num/2;

        for(int i=0; i<answer.length; i++) {
            answer[i] = n-t+i;
        }

        return answer;
    }
}
