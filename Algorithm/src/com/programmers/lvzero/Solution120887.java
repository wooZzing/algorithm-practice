package com.programmers.lvzero;

class Solution120887 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        System.out.print(8/10);
        for (; i <= j; i++){
            int tmp = i;
            while (tmp != 0){
                if (tmp % 10 == k)
                    answer++;
                tmp /= 10;
            }
        }
        return answer;
    }
}
