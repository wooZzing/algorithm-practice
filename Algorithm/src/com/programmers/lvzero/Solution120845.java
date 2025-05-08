package com.programmers.lvzero;

class Solution120845 {
    public int solution(int[] box, int n) {
        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;

        int answer = x*y*z;
        return answer;
    }
}
